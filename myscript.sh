echo Hello
mkdir test-output || true
git clone https://github.com/mirskiy/heimdall-lite || true
cp heimdall-lite/heimdallite.html test-output/index.html
cp heimdall-lite/data/sample_json/rhel-test1.json test-output/test.json
