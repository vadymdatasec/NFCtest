public class e.f.c.l.e.w.c implements e.f.c.l.e.w.d {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public final Integer a;
	 /* # direct methods */
	 public e.f.c.l.e.w.c ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 2 */
		 /* iput p1, p0, Le/f/c/l/e/w/c;->a:I */
		 return;
	 } // .end method
	 public static Boolean a ( java.lang.StackTraceElement[] p0, Integer p1, Integer p2 ) {
		 /* .locals 5 */
		 /* sub-int v0, p2, p1 */
		 /* add-int v1, p2, v0 */
		 /* .line 15 */
		 /* array-length v2, p0 */
		 int v3 = 0; // const/4 v3, 0x0
		 /* if-le v1, v2, :cond_0 */
	 } // :cond_0
	 int v1 = 0; // const/4 v1, 0x0
} // :goto_0
/* if-ge v1, v0, :cond_2 */
/* add-int v2, p1, v1 */
/* .line 16 */
/* aget-object v2, p0, v2 */
/* add-int v4, p2, v1 */
/* aget-object v4, p0, v4 */
v2 = (( java.lang.StackTraceElement ) v2 ).equals ( v4 ); // invoke-virtual {v2, v4}, Ljava/lang/StackTraceElement;->equals(Ljava/lang/Object;)Z
/* if-nez v2, :cond_1 */
} // :cond_1
/* add-int/lit8 v1, v1, 0x1 */
} // :cond_2
int p0 = 1; // const/4 p0, 0x1
} // .end method
public static java.lang.StackTraceElement a ( java.lang.StackTraceElement[] p0, Integer p1 ) {
/* .locals 10 */
/* .line 3 */
/* new-instance v0, Ljava/util/HashMap; */
/* invoke-direct {v0}, Ljava/util/HashMap;-><init>()V */
/* .line 4 */
/* array-length v1, p0 */
/* new-array v1, v1, [Ljava/lang/StackTraceElement; */
int v2 = 0; // const/4 v2, 0x0
int v3 = 1; // const/4 v3, 0x1
int v4 = 0; // const/4 v4, 0x0
int v5 = 0; // const/4 v5, 0x0
int v6 = 1; // const/4 v6, 0x1
/* .line 5 */
} // :goto_0
/* array-length v7, p0 */
/* if-ge v4, v7, :cond_3 */
/* .line 6 */
/* aget-object v7, p0, v4 */
/* .line 7 */
/* check-cast v8, Ljava/lang/Integer; */
if ( v8 != null) { // if-eqz v8, :cond_2
/* .line 8 */
v9 = (( java.lang.Integer ) v8 ).intValue ( ); // invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I
v9 = e.f.c.l.e.w.c .a ( p0,v9,v4 );
/* if-nez v9, :cond_0 */
/* .line 9 */
} // :cond_0
v8 = (( java.lang.Integer ) v8 ).intValue ( ); // invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I
/* sub-int v8, v4, v8 */
/* if-ge v6, p1, :cond_1 */
/* .line 10 */
java.lang.System .arraycopy ( p0,v4,v1,v5,v8 );
/* add-int/2addr v5, v8 */
/* add-int/lit8 v6, v6, 0x1 */
} // :cond_1
/* add-int/lit8 v8, v8, -0x1 */
/* add-int/2addr v8, v4 */
/* .line 11 */
} // :cond_2
} // :goto_1
/* aget-object v6, p0, v4 */
/* aput-object v6, v1, v5 */
/* add-int/lit8 v5, v5, 0x1 */
/* move v8, v4 */
int v6 = 1; // const/4 v6, 0x1
/* .line 12 */
} // :goto_2
java.lang.Integer .valueOf ( v4 );
/* add-int/lit8 v4, v8, 0x1 */
/* .line 13 */
} // :cond_3
/* new-array p0, v5, [Ljava/lang/StackTraceElement; */
/* .line 14 */
java.lang.System .arraycopy ( v1,v2,p0,v2,v5 );
} // .end method
/* # virtual methods */
public java.lang.StackTraceElement a ( java.lang.StackTraceElement[] p0 ) {
/* .locals 3 */
/* .line 1 */
/* iget v0, p0, Le/f/c/l/e/w/c;->a:I */
e.f.c.l.e.w.c .a ( p1,v0 );
/* .line 2 */
/* array-length v1, v0 */
/* array-length v2, p1 */
/* if-ge v1, v2, :cond_0 */
} // :cond_0
} // .end method
