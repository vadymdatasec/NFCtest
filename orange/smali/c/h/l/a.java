public class c.h.l.a {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public final android.text.TextPaint a;
	 public android.text.TextDirectionHeuristic b;
	 public Integer c;
	 public Integer d;
	 /* # direct methods */
	 public c.h.l.a ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 2 */
		 this.a = p1;
		 /* .line 3 */
		 /* const/16 v0, 0x17 */
		 /* if-lt p1, v0, :cond_0 */
		 int p1 = 1; // const/4 p1, 0x1
		 /* .line 4 */
		 /* iput p1, p0, Lc/h/l/a;->c:I */
		 /* .line 5 */
		 /* iput p1, p0, Lc/h/l/a;->d:I */
	 } // :cond_0
	 int p1 = 0; // const/4 p1, 0x0
	 /* .line 6 */
	 /* iput p1, p0, Lc/h/l/a;->d:I */
	 /* iput p1, p0, Lc/h/l/a;->c:I */
	 /* .line 7 */
} // :goto_0
/* const/16 v0, 0x12 */
/* if-lt p1, v0, :cond_1 */
/* .line 8 */
p1 = android.text.TextDirectionHeuristics.FIRSTSTRONG_LTR;
this.b = p1;
} // :cond_1
int p1 = 0; // const/4 p1, 0x0
/* .line 9 */
this.b = p1;
} // :goto_1
return;
} // .end method
/* # virtual methods */
public c.h.l.a a ( Integer p0 ) {
/* .locals 0 */
/* .line 1 */
/* iput p1, p0, Lc/h/l/a;->c:I */
} // .end method
public c.h.l.a a ( android.text.TextDirectionHeuristic p0 ) {
/* .locals 0 */
/* .line 2 */
this.b = p1;
} // .end method
public c.h.l.b a ( ) {
/* .locals 5 */
/* .line 3 */
/* new-instance v0, Lc/h/l/b; */
v1 = this.a;
v2 = this.b;
/* iget v3, p0, Lc/h/l/a;->c:I */
/* iget v4, p0, Lc/h/l/a;->d:I */
/* invoke-direct {v0, v1, v2, v3, v4}, Lc/h/l/b;-><init>(Landroid/text/TextPaint;Landroid/text/TextDirectionHeuristic;II)V */
} // .end method
public c.h.l.a b ( Integer p0 ) {
/* .locals 0 */
/* .line 1 */
/* iput p1, p0, Lc/h/l/a;->d:I */
} // .end method
