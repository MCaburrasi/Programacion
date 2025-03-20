ip_list = [ip for ip in input('').split(',')]
prefix_list = [prefix for prefix in input('').split(' ')]
consecutive_ips = 0

for index in range(len(ip_list)):
    if index != len(ip_list):
        if ip_list[index].startswith(prefix_list[0]) and ip_list[index + 1].startswith(prefix_list[1]):
            consecutive_ips += 1

print(len(ip_list), consecutive_ips)