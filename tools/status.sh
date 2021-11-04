COMMIT_DATE=$(git log -1 --date=format:'%Y%m%d-%H%M%S' --format=%cd)
SHORT_SHA=$(git log -1 --format=%h)

echo "STABLE_TAG ${COMMIT_DATE}-${SHORT_SHA}"