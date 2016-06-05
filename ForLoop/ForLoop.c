#include <stdio.h>
#include <stdint.h>
#include <inttypes.h>

int main() {
	int32_t n;
	int64_t sum = 0;
	scanf("%" PRId32 "\n", &n);
	for (int i = 0; i < n; i++) {
		int temp;
		scanf("%" PRId32 "\n", &temp);
		sum += temp;
	}
	printf("%" PRId64 "\n", sum);
	return 0;
}