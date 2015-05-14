#!/bin/bash

find target -name "*.a" | grep ios | grep rust | xargs lipo -create -output "../ios/libhello_rust-ios.a"

cp `find target -name "*.a" | grep linux | grep rust` ../android/hello-jni/jni/libhello_rust-android.a

ndk-build -C ../android/hello-jni/jni
