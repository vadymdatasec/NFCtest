public class c.l.d.s$b implements android.content.DialogInterface$OnCancelListener {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lc/l/d/s; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x1 */
/* name = null */
} // .end annotation
/* # instance fields */
public final c.l.d.s b; //synthetic
/* # direct methods */
public c.l.d.s$b ( ) {
/* .locals 0 */
/* .line 1 */
this.b = p1;
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void onCancel ( android.content.DialogInterface p0 ) {
/* .locals 1 */
/* .annotation build Landroid/annotation/SuppressLint; */
/* value = { */
/* "SyntheticAccessor" */
/* } */
} // .end annotation
/* .line 1 */
p1 = this.b;
c.l.d.s .a ( p1 );
if ( p1 != null) { // if-eqz p1, :cond_0
/* .line 2 */
p1 = this.b;
c.l.d.s .a ( p1 );
(( c.l.d.s ) p1 ).onCancel ( v0 ); // invoke-virtual {p1, v0}, Lc/l/d/s;->onCancel(Landroid/content/DialogInterface;)V
} // :cond_0
return;
} // .end method
