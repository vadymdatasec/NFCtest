public class m.a.b.g implements java.util.Enumeration {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public java.util.Enumeration a;
	 /* # direct methods */
	 public m.a.b.g ( ) {
		 /* .locals 6 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 2 */
		 (( java.util.Hashtable ) p1 ).keys ( ); // invoke-virtual {p1}, Ljava/util/Hashtable;->keys()Ljava/util/Enumeration;
		 /* .line 3 */
		 /* new-instance v1, Ljava/util/Vector; */
		 p1 = 		 (( java.util.Hashtable ) p1 ).size ( ); // invoke-virtual {p1}, Ljava/util/Hashtable;->size()I
		 /* invoke-direct {v1, p1}, Ljava/util/Vector;-><init>(I)V */
		 int p1 = 0; // const/4 p1, 0x0
		 int v2 = 0; // const/4 v2, 0x0
		 /* .line 4 */
	 v3 = 	 } // :goto_0
	 if ( v3 != null) { // if-eqz v3, :cond_2
		 /* .line 5 */
		 /* check-cast v3, Ljava/lang/String; */
		 int v4 = 0; // const/4 v4, 0x0
	 } // :goto_1
	 /* if-ge v4, v2, :cond_1 */
	 /* .line 6 */
	 (( java.util.Vector ) v1 ).get ( v4 ); // invoke-virtual {v1, v4}, Ljava/util/Vector;->get(I)Ljava/lang/Object;
	 /* check-cast v5, Ljava/lang/String; */
	 /* .line 7 */
	 v5 = 	 (( java.lang.String ) v3 ).compareTo ( v5 ); // invoke-virtual {v3, v5}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I
	 /* if-gtz v5, :cond_0 */
} // :cond_0
/* add-int/lit8 v4, v4, 0x1 */
/* .line 8 */
} // :cond_1
} // :goto_2
(( java.util.Vector ) v1 ).add ( v4, v3 ); // invoke-virtual {v1, v4, v3}, Ljava/util/Vector;->add(ILjava/lang/Object;)V
/* add-int/lit8 v2, v2, 0x1 */
/* .line 9 */
} // :cond_2
(( java.util.Vector ) v1 ).elements ( ); // invoke-virtual {v1}, Ljava/util/Vector;->elements()Ljava/util/Enumeration;
this.a = p1;
return;
} // .end method
/* # virtual methods */
public Boolean hasMoreElements ( ) {
/* .locals 1 */
/* .line 1 */
v0 = v0 = this.a;
} // .end method
public java.lang.Object nextElement ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.a;
} // .end method
