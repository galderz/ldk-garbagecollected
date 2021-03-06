package org.ldk.structs;

import org.ldk.impl.bindings;
import org.ldk.enums.*;
import org.ldk.util.*;
import java.util.Arrays;

@SuppressWarnings("unchecked") // We correctly assign various generic arrays
public class Result_DirectionalChannelInfoDecodeErrorZ extends CommonBase {
	private Result_DirectionalChannelInfoDecodeErrorZ(Object _dummy, long ptr) { super(ptr); }
	protected void finalize() throws Throwable {
		if (ptr != 0) { bindings.CResult_DirectionalChannelInfoDecodeErrorZ_free(ptr); } super.finalize();
	}

	static Result_DirectionalChannelInfoDecodeErrorZ constr_from_ptr(long ptr) {
		if (bindings.LDKCResult_DirectionalChannelInfoDecodeErrorZ_result_ok(ptr)) {
			return new Result_DirectionalChannelInfoDecodeErrorZ_OK(null, ptr);
		} else {
			return new Result_DirectionalChannelInfoDecodeErrorZ_Err(null, ptr);
		}
	}
	public static final class Result_DirectionalChannelInfoDecodeErrorZ_OK extends Result_DirectionalChannelInfoDecodeErrorZ {
		public final DirectionalChannelInfo res;
		private Result_DirectionalChannelInfoDecodeErrorZ_OK(Object _dummy, long ptr) {
			super(_dummy, ptr);
			long res = bindings.LDKCResult_DirectionalChannelInfoDecodeErrorZ_get_ok(ptr);
			DirectionalChannelInfo res_hu_conv = new DirectionalChannelInfo(null, res);
			res_hu_conv.ptrs_to.add(this);
			this.res = res_hu_conv;
		}
		public Result_DirectionalChannelInfoDecodeErrorZ_OK(DirectionalChannelInfo res) {
			this(null, bindings.CResult_DirectionalChannelInfoDecodeErrorZ_ok(res == null ? 0 : res.ptr & ~1));
			this.ptrs_to.add(res);
		}
	}

	public static final class Result_DirectionalChannelInfoDecodeErrorZ_Err extends Result_DirectionalChannelInfoDecodeErrorZ {
		public final DecodeError err;
		private Result_DirectionalChannelInfoDecodeErrorZ_Err(Object _dummy, long ptr) {
			super(_dummy, ptr);
			long err = bindings.LDKCResult_DirectionalChannelInfoDecodeErrorZ_get_err(ptr);
			DecodeError err_hu_conv = new DecodeError(null, err);
			err_hu_conv.ptrs_to.add(this);
			this.err = err_hu_conv;
		}
		public Result_DirectionalChannelInfoDecodeErrorZ_Err(DecodeError err) {
			this(null, bindings.CResult_DirectionalChannelInfoDecodeErrorZ_err(err == null ? 0 : err.ptr & ~1));
			this.ptrs_to.add(err);
		}
	}
}
