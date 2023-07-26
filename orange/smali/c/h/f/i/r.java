public abstract class c.h.f.i.r {
	 /* .source "SourceFile" */
	 /* # direct methods */
	 public c.h.f.i.r ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 public static android.os.Handler a ( android.os.Handler p0 ) {
		 /* .locals 1 */
		 /* if-nez p0, :cond_0 */
		 /* .line 3 */
		 /* new-instance p0, Landroid/os/Handler; */
		 android.os.Looper .getMainLooper ( );
		 /* invoke-direct {p0, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V */
	 } // :cond_0
} // .end method
/* # virtual methods */
public abstract void a ( Integer p0 ) {
} // .end method
public final void a ( Integer p0, android.os.Handler p1 ) {
	 /* .locals 1 */
	 /* .line 2 */
	 c.h.f.i.r .a ( p2 );
	 /* new-instance v0, Lc/h/f/i/q; */
	 /* invoke-direct {v0, p0, p1}, Lc/h/f/i/q;-><init>(Lc/h/f/i/r;I)V */
	 (( android.os.Handler ) p2 ).post ( v0 ); // invoke-virtual {p2, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
	 return;
} // .end method
public abstract void a ( android.graphics.Typeface p0 ) {
} // .end method
public final void a ( android.graphics.Typeface p0, android.os.Handler p1 ) {
	 /* .locals 1 */
	 /* .line 1 */
	 c.h.f.i.r .a ( p2 );
	 /* new-instance v0, Lc/h/f/i/p; */
	 /* invoke-direct {v0, p0, p1}, Lc/h/f/i/p;-><init>(Lc/h/f/i/r;Landroid/graphics/Typeface;)V */
	 (( android.os.Handler ) p2 ).post ( v0 ); // invoke-virtual {p2, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
	 return;
} // .end method
