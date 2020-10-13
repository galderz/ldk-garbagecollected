package org.ldk.structs;

import org.ldk.impl.bindings;
import org.ldk.enums.*;

public class Shutdown extends CommonBase {
	Shutdown(Object _dummy, long ptr) { super(ptr); }
	@Override @SuppressWarnings("deprecation")
	protected void finalize() throws Throwable {
		bindings.Shutdown_free(ptr); super.finalize();
	}

	public Shutdown(Shutdown orig) {
		super(bindings.Shutdown_clone(orig == null ? 0 : orig.ptr & ~1));
		this.ptrs_to.add(orig);
	}

	public byte[] get_channel_id(Shutdown this_ptr) {
		byte[] ret = bindings.Shutdown_get_channel_id(this_ptr == null ? 0 : this_ptr.ptr & ~1);
		this.ptrs_to.add(this_ptr);
		return ret;
	}

	public void set_channel_id(Shutdown this_ptr, byte[] val) {
		bindings.Shutdown_set_channel_id(this_ptr == null ? 0 : this_ptr.ptr & ~1, val);
		this.ptrs_to.add(this_ptr);
	}

	public byte[] get_scriptpubkey(Shutdown this_ptr) {
		byte[] ret = bindings.Shutdown_get_scriptpubkey(this_ptr == null ? 0 : this_ptr.ptr & ~1);
		this.ptrs_to.add(this_ptr);
		return ret;
	}

	// Skipped Shutdown_set_scriptpubkey
	// Skipped Shutdown_new
	// Skipped Shutdown_write
	public Shutdown(byte[] ser) {
		super(bindings.Shutdown_read(ser));
	}

}
