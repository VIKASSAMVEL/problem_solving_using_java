$tasks = @{
    "Task1" = "5`n4 2 8 1 5"
    "Task2" = "5`n1 4`n2 5`n3 898`n1 3`n2 12"
    "Task3" = "3`nAlice 23`nBob 30`nCharlie 25`n24"
    "Task4" = "5`nEventA 2025-12-17`nEventB 2024-01-10`nEventC 2025-06-05`nEventD 2024-12-31`nEventE 2025-12-01`n12"
    "Task5" = "6`nArun 85`nBala 92`nCharan 85`nDivya 95`nEsha 92`nFarhan 88`n3"
    "Task6" = "7`nElectronics TV 50000`nElectronics Mobile 40000`nFurniture Sofa 30000`nElectronics Laptop 70000`nFurniture Chair 15000`nFurniture Table 20000`nElectronics Headphones 10000"
    "Task7" = "5`n10 20 10 5 15"
    "Task8" = "nums = [1,3,-1,-3,5,3,6,7], k = 3"
    "Task9" = "nums = [0,0,1,1,1,2,2,3,3,4]"
    "Task10" = "text = `"forxxorfxdofr`", pattern = `"for`""
    "Task11" = "7 3`n1`n51`n966369`n7`n9`n999996`n11"
    "Task12" = "s = `"aaaaaaaaaaa`""
    "Task13" = "3`n101 Alice JavaBasics John 2025-12-20 6`n102 Bob PythonAdvanced Mary 2025-12-22 8`n103 Charlie DataScience Mike 2026-01-05 10"
    "Task14" = "3`nC 101 HondaCivic 2000 5`nB 102 YamahaR15 500 150`nC 103 ToyotaCorolla 2500 4"
    "Task15" = "4`nC 100`nP 50`nU 200`nC 250"
    "Task16" = "4`nE Welcome_to_our_platform`nS Your_OTP_is_1234`nP New_offer_available`nE Password_changed_successfully"
    "Task17" = "5`n101 Laptop 2 5`n102 Mouse 10 8`n103 Keyboard 3 3`n104 Monitor 1 0`n105 Speaker 5 10"
    "Task18" = "2`n101 Alice 1000`n102 Bob 500`n5`nDEPOSIT 101 200`nWITHDRAW 102 100`nTRANSFER 101 102 300`nWITHDRAW 102 1000`nTRANSFER 101 103 50"
    "Task19" = "nums = [1,1,1,2,2,3], k = 2"
    "Task20" = ""
    "Task21" = "23"
    "Task22" = "3`n30 75`n0 50`n60 150"
    "Task23" = "5`nItemA 8.8`nItemB 7.5`nItemC 8.6`nItemD 7.9`nItemE 8.4"
    "Task24" = ""
    "Task25" = ""
    "Task26" = ""
    "Task27" = ""
    "Task28" = ""
}

foreach ($i in 1..28) {
    echo "=============================="
    echo "OUTPUT FOR Task$i"
    echo "------------------------------"
    $taskName = "Task$i"
    $input = $tasks[$taskName]
    
    if (-not (Test-Path "$taskName.class")) {
        echo "Class $taskName not found. Skipping."
        continue
    }

    if ($input -eq "") {
        java $taskName
    } else {
        # Using Write-Output to pipe the multiline string properly into java
        Write-Output $input | java $taskName
    }
}
