PGPASSWORD=postgres /Applications/Postgres.app/Contents/Versions/11/bin/dropdb -U postgres supplierfinance
PGPASSWORD=postgres /Applications/Postgres.app/Contents/Versions/11/bin/createdb -T template0 -U postgres supplierfinance
PGPASSWORD=postgres /Applications/Postgres.app/Contents/Versions/11/bin/pg_restore -d supplierfinance -v -U postgres
