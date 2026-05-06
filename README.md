# forge-plat-kube-hub

`forge-plat-kube-hub` is a Java project in platform engineering. Its focus is to package a Java local lab for kube analysis with windowed input fixtures, late-data behavior checks, and documented operating limits.

## Purpose

The project exists to keep a narrow engineering decision visible and testable. For this repo, that decision is how rollout width and route drift should influence a review result.

## Forge Plat Kube Hub Review Notes

For a quick review, compare `route drift` with `rollout width` before reading the middle cases.

## What Is Covered

- `fixtures/domain_review.csv` adds cases for rollout width and quota pressure.
- `metadata/domain-review.json` records the same cases in structured form.
- `config/review-profile.json` captures the read order and the two review questions.
- `examples/forge-plat-kube-walkthrough.md` walks through the case spread.
- The Java code includes a review path for `route drift` and `rollout width`.
- `docs/field-notes.md` explains the strongest and weakest cases.

## Implementation Notes

The implementation keeps the scoring rule plain: reward signal and confidence, preserve slack, penalize drag, then classify the result into a review lane.

The Java implementation avoids hidden state so fixture changes are easy to reason about.

## Command

```powershell
powershell -NoProfile -ExecutionPolicy Bypass -File scripts/verify.ps1
```

## Audit Path

That command is also the regression path. It verifies the domain cases and catches mismatches between the CSV, metadata, and code.

## Limits

This remains a local project with deterministic fixtures. It does not depend on credentials, hosted services, or live data. Future work should add richer malformed inputs before widening the public API.
