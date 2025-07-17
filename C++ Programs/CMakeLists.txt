cmake_minimum_required(VERSION 3.10)
project(ATLAS_CPP_Programs)

set(CMAKE_CXX_STANDARD 17)
set(CMAKE_CXX_STANDARD_REQUIRED ON)

# Add all cpp files as executables
file(GLOB CPP_SOURCES "*.cpp")

foreach(source_file ${CPP_SOURCES})
    get_filename_component(executable_name ${source_file} NAME_WE)
    add_executable(${executable_name} ${source_file})
endforeach()