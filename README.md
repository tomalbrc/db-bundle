# Database Bundle Mod

This Fabric mod bundles common database drivers for use in other mods.

The included libraries are:

- MongoDB (with driver-sync, driver-core and bson)
- HikariCP (5.1.0)
- MariaDB JDBC driver (3.5.6)
- PostgreSQL JDBC driver (42.7.8)
- SQLite JDBC driver (3.50.3.0)

The mod exists to reduce duplication of large database libraries.
Instead of including these libraries in every mod separately, this mod contains them all.

# Maven / gradle:

Repository:
- `maven { url 'https://maven.tomalbrc.de' }`

Dependency:
- `modImplementation ("de.tomalbrc:db-bundle:1.1.0")`


Or use modrinth maven