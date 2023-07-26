public class androidx.appcompat.widget.SearchView$c implements java.lang.Runnable {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Landroidx/appcompat/widget/SearchView; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x1 */
/* name = null */
} // .end annotation
/* # instance fields */
public final androidx.appcompat.widget.SearchView b; //synthetic
/* # direct methods */
public androidx.appcompat.widget.SearchView$c ( ) {
/* .locals 0 */
/* .line 1 */
this.b = p1;
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void run ( ) {
/* .locals 2 */
/* .line 1 */
v0 = this.b;
v0 = this.S;
/* instance-of v1, v0, Lc/b/q/f2; */
if ( v1 != null) { // if-eqz v1, :cond_0
	 int v1 = 0; // const/4 v1, 0x0
	 /* .line 2 */
	 (( c.i.a.c ) v0 ).b ( v1 ); // invoke-virtual {v0, v1}, Lc/i/a/c;->b(Landroid/database/Cursor;)V
} // :cond_0
return;
} // .end method
