# Notes for rust library #

## create fat lib for ios ##

* `find target -name "*.a" | grep ios | xargs lipo -create -output "libhello_rust-ios.a"`

* "cp `find target -name "*.a" | grep "linux"` libhello_rust-android.a"
