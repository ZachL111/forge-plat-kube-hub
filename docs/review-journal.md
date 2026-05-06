# Review Journal

The review surface for `forge-plat-kube-hub` is deliberately narrow: one fixture, one scoring rule, and one local check.

The local checks classify each case as `ship`, `watch`, or `hold`. That gives the project a small review vocabulary that matches its platform engineering focus without claiming live deployment or external usage.

## Cases

- `baseline`: `rollout width`, score 126, lane `watch`
- `stress`: `quota pressure`, score 137, lane `watch`
- `edge`: `route drift`, score 193, lane `ship`
- `recovery`: `secret scope`, score 172, lane `ship`
- `stale`: `rollout width`, score 182, lane `ship`

## Note

The repository should be understandable without pretending it is larger than it is.
