public class com.google.android.material.behavior.SwipeDismissBehavior$c implements java.lang.Runnable {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lcom/google/android/material/behavior/SwipeDismissBehavior; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x1 */
/* name = "c" */
} // .end annotation
/* # instance fields */
public final android.view.View b;
public final Boolean c;
public final com.google.android.material.behavior.SwipeDismissBehavior d; //synthetic
/* # direct methods */
public com.google.android.material.behavior.SwipeDismissBehavior$c ( ) {
/* .locals 0 */
/* .line 1 */
this.d = p1;
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 2 */
this.b = p2;
/* .line 3 */
/* iput-boolean p3, p0, Lcom/google/android/material/behavior/SwipeDismissBehavior$c;->c:Z */
return;
} // .end method
/* # virtual methods */
public void run ( ) {
/* .locals 2 */
/* .line 1 */
v0 = this.d;
v0 = this.a;
if ( v0 != null) { // if-eqz v0, :cond_0
	 int v1 = 1; // const/4 v1, 0x1
	 v0 = 	 (( c.j.b.c ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lc/j/b/c;->a(Z)Z
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 /* .line 2 */
		 v0 = this.b;
		 c.h.n.v0 .a ( v0,p0 );
		 /* .line 3 */
	 } // :cond_0
	 /* iget-boolean v0, p0, Lcom/google/android/material/behavior/SwipeDismissBehavior$c;->c:Z */
	 if ( v0 != null) { // if-eqz v0, :cond_1
		 v0 = this.d;
		 v0 = this.b;
		 if ( v0 != null) { // if-eqz v0, :cond_1
			 /* .line 4 */
			 v1 = this.b;
		 } // :cond_1
	 } // :goto_0
	 return;
} // .end method
