# Forge Plat Kube Hub Walkthrough

This walk-through keeps the domain vocabulary close to the data instead of burying it in prose.

| Case | Focus | Score | Lane |
| --- | --- | ---: | --- |
| baseline | rollout width | 126 | watch |
| stress | quota pressure | 137 | watch |
| edge | route drift | 193 | ship |
| recovery | secret scope | 172 | ship |
| stale | rollout width | 182 | ship |

Start with `edge` and `baseline`. They create the widest contrast in this repository's fixture set, which makes them better review anchors than the middle cases.

The useful comparison is `route drift` against `rollout width`, not the raw score alone.
