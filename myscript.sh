echo Hello
mkdir test-output || true
git clone https://github.com/mitre/heimdall-lite || true
cp heimdall-lite/docs/index.html test-output/index.html
cp heimdall-lite/data/sample_json/rhel-test1.json test-output/test.json
