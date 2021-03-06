package org.ldk.structs;

import org.ldk.impl.bindings;
import org.ldk.enums.*;
import org.ldk.util.*;
import java.util.Arrays;

@SuppressWarnings("unchecked") // We correctly assign various generic arrays
public class MonitorUpdateError extends CommonBase {
	MonitorUpdateError(Object _dummy, long ptr) { super(ptr); }
	@Override @SuppressWarnings("deprecation")
	protected void finalize() throws Throwable {
		super.finalize();
		if (ptr != 0) { bindings.MonitorUpdateError_free(ptr); }
	}

	public MonitorUpdateError clone() {
		long ret = bindings.MonitorUpdateError_clone(this.ptr);
		MonitorUpdateError ret_hu_conv = new MonitorUpdateError(null, ret);
		ret_hu_conv.ptrs_to.add(this);
		return ret_hu_conv;
	}

}
