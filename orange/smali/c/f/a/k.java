public class c.f.a.k {
	 /* .source "SourceFile" */
	 /* # static fields */
	 public static Integer k;
	 /* # instance fields */
	 public java.lang.String a;
	 public Integer b;
	 public Integer c;
	 public Integer d;
	 public Float e;
	 public f;
	 public c.f.a.j g;
	 public c.f.a.b h;
	 public Integer i;
	 public Integer j;
	 /* # direct methods */
	 public static c.f.a.k ( ) {
		 /* .locals 0 */
		 return;
	 } // .end method
	 public c.f.a.k ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 int p2 = -1; // const/4 p2, -0x1
		 /* .line 2 */
		 /* iput p2, p0, Lc/f/a/k;->b:I */
		 /* .line 3 */
		 /* iput p2, p0, Lc/f/a/k;->c:I */
		 int p2 = 0; // const/4 p2, 0x0
		 /* .line 4 */
		 /* iput p2, p0, Lc/f/a/k;->d:I */
		 int v0 = 7; // const/4 v0, 0x7
		 /* new-array v0, v0, [F */
		 /* .line 5 */
		 this.f = v0;
		 /* const/16 v0, 0x8 */
		 /* new-array v0, v0, [Lc/f/a/b; */
		 /* .line 6 */
		 this.h = v0;
		 /* .line 7 */
		 /* iput p2, p0, Lc/f/a/k;->i:I */
		 /* .line 8 */
		 /* iput p2, p0, Lc/f/a/k;->j:I */
		 /* .line 9 */
		 this.g = p1;
		 return;
	 } // .end method
	 public static void b ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 /* add-int/lit8 v0, v0, 0x1 */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void a ( ) {
		 /* .locals 2 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* .line 7 */
		 this.a = v0;
		 /* .line 8 */
		 v0 = c.f.a.j.f;
		 this.g = v0;
		 int v0 = 0; // const/4 v0, 0x0
		 /* .line 9 */
		 /* iput v0, p0, Lc/f/a/k;->d:I */
		 int v1 = -1; // const/4 v1, -0x1
		 /* .line 10 */
		 /* iput v1, p0, Lc/f/a/k;->b:I */
		 /* .line 11 */
		 /* iput v1, p0, Lc/f/a/k;->c:I */
		 int v1 = 0; // const/4 v1, 0x0
		 /* .line 12 */
		 /* iput v1, p0, Lc/f/a/k;->e:F */
		 /* .line 13 */
		 /* iput v0, p0, Lc/f/a/k;->i:I */
		 /* .line 14 */
		 /* iput v0, p0, Lc/f/a/k;->j:I */
		 return;
	 } // .end method
	 public final void a ( Object p0 ) {
		 /* .locals 3 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* .line 1 */
	 } // :goto_0
	 /* iget v1, p0, Lc/f/a/k;->i:I */
	 /* if-ge v0, v1, :cond_1 */
	 /* .line 2 */
	 v1 = this.h;
	 /* aget-object v1, v1, v0 */
	 /* if-ne v1, p1, :cond_0 */
	 return;
} // :cond_0
/* add-int/lit8 v0, v0, 0x1 */
/* .line 3 */
} // :cond_1
v0 = this.h;
/* array-length v2, v0 */
/* if-lt v1, v2, :cond_2 */
/* .line 4 */
/* array-length v1, v0 */
/* mul-int/lit8 v1, v1, 0x2 */
java.util.Arrays .copyOf ( v0,v1 );
/* check-cast v0, [Lc/f/a/b; */
this.h = v0;
/* .line 5 */
} // :cond_2
v0 = this.h;
/* iget v1, p0, Lc/f/a/k;->i:I */
/* aput-object p1, v0, v1 */
/* add-int/lit8 v1, v1, 0x1 */
/* .line 6 */
/* iput v1, p0, Lc/f/a/k;->i:I */
return;
} // .end method
public void a ( Object p0, java.lang.String p1 ) {
/* .locals 0 */
/* .line 15 */
this.g = p1;
return;
} // .end method
public final void b ( Object p0 ) {
/* .locals 5 */
/* .line 2 */
/* iget v0, p0, Lc/f/a/k;->i:I */
int v1 = 0; // const/4 v1, 0x0
int v2 = 0; // const/4 v2, 0x0
} // :goto_0
/* if-ge v2, v0, :cond_2 */
/* .line 3 */
v3 = this.h;
/* aget-object v3, v3, v2 */
/* if-ne v3, p1, :cond_1 */
} // :goto_1
/* sub-int p1, v0, v2 */
/* add-int/lit8 p1, p1, -0x1 */
/* if-ge v1, p1, :cond_0 */
/* .line 4 */
p1 = this.h;
/* add-int v3, v2, v1 */
/* add-int/lit8 v4, v3, 0x1 */
/* aget-object v4, p1, v4 */
/* aput-object v4, p1, v3 */
/* add-int/lit8 v1, v1, 0x1 */
/* .line 5 */
} // :cond_0
/* iget p1, p0, Lc/f/a/k;->i:I */
/* add-int/lit8 p1, p1, -0x1 */
/* iput p1, p0, Lc/f/a/k;->i:I */
return;
} // :cond_1
/* add-int/lit8 v2, v2, 0x1 */
} // :cond_2
return;
} // .end method
public final void c ( Object p0 ) {
/* .locals 5 */
/* .line 1 */
/* iget v0, p0, Lc/f/a/k;->i:I */
int v1 = 0; // const/4 v1, 0x0
int v2 = 0; // const/4 v2, 0x0
} // :goto_0
/* if-ge v2, v0, :cond_0 */
/* .line 2 */
v3 = this.h;
/* aget-object v4, v3, v2 */
v4 = this.d;
/* aget-object v3, v3, v2 */
(( c.f.a.a ) v4 ).a ( v3, p1, v1 ); // invoke-virtual {v4, v3, p1, v1}, Lc/f/a/a;->a(Lc/f/a/b;Lc/f/a/b;Z)V
/* add-int/lit8 v2, v2, 0x1 */
/* .line 3 */
} // :cond_0
/* iput v1, p0, Lc/f/a/k;->i:I */
return;
} // .end method
public java.lang.String toString ( ) {
/* .locals 2 */
/* .line 1 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
final String v1 = ""; // const-string v1, ""
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v1 = this.a;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // .end method
