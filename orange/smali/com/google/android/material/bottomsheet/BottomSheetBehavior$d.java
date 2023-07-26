public class com.google.android.material.bottomsheet.BottomSheetBehavior$d implements java.lang.Runnable {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lcom/google/android/material/bottomsheet/BottomSheetBehavior; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x1 */
/* name = "d" */
} // .end annotation
/* # instance fields */
public final android.view.View b;
public final Integer c;
public final com.google.android.material.bottomsheet.BottomSheetBehavior d; //synthetic
/* # direct methods */
public com.google.android.material.bottomsheet.BottomSheetBehavior$d ( ) {
/* .locals 0 */
/* .line 1 */
this.d = p1;
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 2 */
this.b = p2;
/* .line 3 */
/* iput p3, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior$d;->c:I */
return;
} // .end method
/* # virtual methods */
public void run ( ) {
/* .locals 2 */
/* .line 1 */
v0 = this.d;
v0 = this.m;
if ( v0 != null) { // if-eqz v0, :cond_0
	 int v1 = 1; // const/4 v1, 0x1
	 v0 = 	 (( c.j.b.c ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lc/j/b/c;->a(Z)Z
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 /* .line 2 */
		 v0 = this.b;
		 c.h.n.v0 .a ( v0,p0 );
		 /* .line 3 */
	 } // :cond_0
	 v0 = this.d;
	 /* iget v1, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior$d;->c:I */
	 (( com.google.android.material.bottomsheet.BottomSheetBehavior ) v0 ).c ( v1 ); // invoke-virtual {v0, v1}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->c(I)V
} // :goto_0
return;
} // .end method
