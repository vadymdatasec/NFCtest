public class e.f.a.b.c.m.e {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public final android.util.SparseIntArray a;
	 public e.f.a.b.c.f b;
	 /* # direct methods */
	 public e.f.a.b.c.m.e ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 2 */
		 /* new-instance v0, Landroid/util/SparseIntArray; */
		 /* invoke-direct {v0}, Landroid/util/SparseIntArray;-><init>()V */
		 this.a = v0;
		 /* .line 3 */
		 e.f.a.b.c.m.h .a ( p1 );
		 /* .line 4 */
		 this.b = p1;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public Integer a ( android.content.Context p0, Object p1 ) {
		 /* .locals 6 */
		 /* .line 1 */
		 e.f.a.b.c.m.h .a ( p1 );
		 /* .line 2 */
		 e.f.a.b.c.m.h .a ( p2 );
		 v0 = 		 /* .line 3 */
		 int v1 = 0; // const/4 v1, 0x0
		 /* if-nez v0, :cond_0 */
		 /* .line 4 */
	 p2 = 	 } // :cond_0
	 /* .line 5 */
	 v0 = this.a;
	 int v2 = -1; // const/4 v2, -0x1
	 v0 = 	 (( android.util.SparseIntArray ) v0 ).get ( p2, v2 ); // invoke-virtual {v0, p2, v2}, Landroid/util/SparseIntArray;->get(II)I
	 /* if-eq v0, v2, :cond_1 */
} // :cond_1
int v3 = 0; // const/4 v3, 0x0
/* .line 6 */
} // :goto_0
v4 = this.a;
v4 = (( android.util.SparseIntArray ) v4 ).size ( ); // invoke-virtual {v4}, Landroid/util/SparseIntArray;->size()I
/* if-ge v3, v4, :cond_3 */
/* .line 7 */
v4 = this.a;
v4 = (( android.util.SparseIntArray ) v4 ).keyAt ( v3 ); // invoke-virtual {v4, v3}, Landroid/util/SparseIntArray;->keyAt(I)I
/* if-le v4, p2, :cond_2 */
/* .line 8 */
v5 = this.a;
v4 = (( android.util.SparseIntArray ) v5 ).get ( v4 ); // invoke-virtual {v5, v4}, Landroid/util/SparseIntArray;->get(I)I
/* if-nez v4, :cond_2 */
} // :cond_2
/* add-int/lit8 v3, v3, 0x1 */
} // :cond_3
/* move v1, v0 */
} // :goto_1
/* if-ne v1, v2, :cond_4 */
/* .line 9 */
v0 = this.b;
v1 = (( e.f.a.b.c.f ) v0 ).a ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Le/f/a/b/c/f;->a(Landroid/content/Context;I)I
/* .line 10 */
} // :cond_4
p1 = this.a;
(( android.util.SparseIntArray ) p1 ).put ( p2, v1 ); // invoke-virtual {p1, p2, v1}, Landroid/util/SparseIntArray;->put(II)V
} // .end method
public void a ( ) {
/* .locals 1 */
/* .line 11 */
v0 = this.a;
(( android.util.SparseIntArray ) v0 ).clear ( ); // invoke-virtual {v0}, Landroid/util/SparseIntArray;->clear()V
return;
} // .end method
