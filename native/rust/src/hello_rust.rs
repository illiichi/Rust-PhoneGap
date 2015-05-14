#![crate_type = "staticlib"]
#![feature(libc)]

extern crate libc;
use std::ffi::CString;
use libc::*;

#[no_mangle]
pub extern "C" fn add(lhs: u32, rhs: u32) -> u32 {
	lhs + rhs
}

#[no_mangle]
pub extern "C" fn hello() -> *const c_char {
	let c_to_print = CString::new("Hello from rust").unwrap();
	c_to_print.as_ptr()
}