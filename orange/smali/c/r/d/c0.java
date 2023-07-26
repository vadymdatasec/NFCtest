public abstract class c.r.d.c0 {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public final androidx.recyclerview.widget.RecyclerView$o a;
	 public Integer b;
	 public final android.graphics.Rect c;
	 /* # direct methods */
	 public c.r.d.c0 ( ) {
		 /* .locals 1 */
		 /* .line 2 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* const/high16 v0, -0x80000000 */
		 /* .line 3 */
		 /* iput v0, p0, Lc/r/d/c0;->b:I */
		 /* .line 4 */
		 /* new-instance v0, Landroid/graphics/Rect; */
		 /* invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V */
		 this.c = v0;
		 /* .line 5 */
		 this.a = p1;
		 return;
	 } // .end method
	 public c.r.d.c0 ( ) { //synthethic
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0, p1}, Lc/r/d/c0;-><init>(Landroidx/recyclerview/widget/RecyclerView$o;)V */
		 return;
	 } // .end method
	 public static c.r.d.c0 a ( androidx.recyclerview.widget.RecyclerView$o p0 ) {
		 /* .locals 1 */
		 /* .line 4 */
		 /* new-instance v0, Lc/r/d/a0; */
		 /* invoke-direct {v0, p0}, Lc/r/d/a0;-><init>(Landroidx/recyclerview/widget/RecyclerView$o;)V */
	 } // .end method
	 public static c.r.d.c0 a ( androidx.recyclerview.widget.RecyclerView$o p0, Integer p1 ) {
		 /* .locals 1 */
		 if ( p1 != null) { // if-eqz p1, :cond_1
			 int v0 = 1; // const/4 v0, 0x1
			 /* if-ne p1, v0, :cond_0 */
			 /* .line 1 */
			 c.r.d.c0 .b ( p0 );
			 /* .line 2 */
		 } // :cond_0
		 /* new-instance p0, Ljava/lang/IllegalArgumentException; */
		 final String p1 = "invalid orientation"; // const-string p1, "invalid orientation"
		 /* invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
		 /* throw p0 */
		 /* .line 3 */
	 } // :cond_1
	 c.r.d.c0 .a ( p0 );
} // .end method
public static c.r.d.c0 b ( androidx.recyclerview.widget.RecyclerView$o p0 ) {
	 /* .locals 1 */
	 /* .line 1 */
	 /* new-instance v0, Lc/r/d/b0; */
	 /* invoke-direct {v0, p0}, Lc/r/d/b0;-><init>(Landroidx/recyclerview/widget/RecyclerView$o;)V */
} // .end method
/* # virtual methods */
public abstract Integer a ( ) {
} // .end method
public abstract Integer a ( android.view.View p0 ) {
} // .end method
public abstract void a ( Integer p0 ) {
} // .end method
public abstract Integer b ( ) {
} // .end method
public abstract Integer b ( android.view.View p0 ) {
} // .end method
public abstract Integer c ( ) {
} // .end method
public abstract Integer c ( android.view.View p0 ) {
} // .end method
public abstract Integer d ( ) {
} // .end method
public abstract Integer d ( android.view.View p0 ) {
} // .end method
public abstract Integer e ( ) {
} // .end method
public abstract Integer e ( android.view.View p0 ) {
} // .end method
public abstract Integer f ( ) {
} // .end method
public abstract Integer f ( android.view.View p0 ) {
} // .end method
public abstract Integer g ( ) {
} // .end method
public Integer h ( ) {
	 /* .locals 2 */
	 /* .line 1 */
	 /* iget v0, p0, Lc/r/d/c0;->b:I */
	 /* const/high16 v1, -0x80000000 */
	 /* if-ne v1, v0, :cond_0 */
	 int v0 = 0; // const/4 v0, 0x0
} // :cond_0
v0 = (( c.r.d.c0 ) p0 ).g ( ); // invoke-virtual {p0}, Lc/r/d/c0;->g()I
/* iget v1, p0, Lc/r/d/c0;->b:I */
/* sub-int/2addr v0, v1 */
} // :goto_0
} // .end method
public void i ( ) {
/* .locals 1 */
/* .line 1 */
v0 = (( c.r.d.c0 ) p0 ).g ( ); // invoke-virtual {p0}, Lc/r/d/c0;->g()I
/* iput v0, p0, Lc/r/d/c0;->b:I */
return;
} // .end method
