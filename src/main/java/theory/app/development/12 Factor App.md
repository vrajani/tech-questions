# 12 Factor App

#### I. Codebase
Codebase is identified as the underlying code for the app that is shared among all the deployments (production, staging, local, etc.).

Codebase for an app should always be tracked by version control system such as git.

The code must not be shared among multiple apps, the common/shared code must be refactored into a library.

#### II. Dependencies
Explicitly declare and isolate dependencies
#### III. Config
Store config in the environment
#### IV. Backing services
Treat backing services as attached resources
#### V. Build, release, run
Strictly separate build and run stages
#### VI. Processes
Execute the app as one or more stateless processes
#### VII. Port binding
Export services via port binding
#### VIII. Concurrency
Scale out via the process model
#### IX. Disposability
Maximize robustness with fast startup and graceful shutdown
#### X. Dev/prod parity
Keep development, staging, and production as similar as possible
#### XI. Logs
Treat logs as event streams
#### XII. Admin processes
Run admin/management tasks as one-off processes