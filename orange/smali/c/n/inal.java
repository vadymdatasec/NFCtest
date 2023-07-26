public class inal {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public final Integer a;
	 public final java.lang.reflect.Method b;
	 /* # direct methods */
	 public inal ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 2 */
		 /* iput p1, p0, Lc/n/b;->a:I */
		 /* .line 3 */
		 this.b = p2;
		 int p1 = 1; // const/4 p1, 0x1
		 /* .line 4 */
		 (( java.lang.reflect.Method ) p2 ).setAccessible ( p1 ); // invoke-virtual {p2, p1}, Ljava/lang/reflect/Method;->setAccessible(Z)V
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void a ( Object p0, c.n.g$a p1, java.lang.Object p2 ) {
		 /* .locals 4 */
		 /* .line 1 */
		 try { // :try_start_0
			 /* iget v0, p0, Lc/n/b;->a:I */
			 int v1 = 0; // const/4 v1, 0x0
			 if ( v0 != null) { // if-eqz v0, :cond_2
				 int v2 = 1; // const/4 v2, 0x1
				 /* if-eq v0, v2, :cond_1 */
				 int v3 = 2; // const/4 v3, 0x2
				 /* if-eq v0, v3, :cond_0 */
				 /* .line 2 */
			 } // :cond_0
			 v0 = this.b;
			 /* new-array v3, v3, [Ljava/lang/Object; */
			 /* aput-object p1, v3, v1 */
			 /* aput-object p2, v3, v2 */
			 (( java.lang.reflect.Method ) v0 ).invoke ( p3, v3 ); // invoke-virtual {v0, p3, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
			 /* .line 3 */
		 } // :cond_1
		 p2 = this.b;
		 /* new-array v0, v2, [Ljava/lang/Object; */
		 /* aput-object p1, v0, v1 */
		 (( java.lang.reflect.Method ) p2 ).invoke ( p3, v0 ); // invoke-virtual {p2, p3, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
		 /* .line 4 */
	 } // :cond_2
	 p1 = this.b;
	 /* new-array p2, v1, [Ljava/lang/Object; */
	 (( java.lang.reflect.Method ) p1 ).invoke ( p3, p2 ); // invoke-virtual {p1, p3, p2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
	 /* :try_end_0 */
	 /* .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 ..:try_end_0} :catch_1 */
	 /* .catch Ljava/lang/IllegalAccessException; {:try_start_0 ..:try_end_0} :catch_0 */
} // :goto_0
return;
/* :catch_0 */
/* move-exception p1 */
/* .line 5 */
/* new-instance p2, Ljava/lang/RuntimeException; */
/* invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V */
/* throw p2 */
/* :catch_1 */
/* move-exception p1 */
/* .line 6 */
/* new-instance p2, Ljava/lang/RuntimeException; */
(( java.lang.reflect.InvocationTargetException ) p1 ).getCause ( ); // invoke-virtual {p1}, Ljava/lang/reflect/InvocationTargetException;->getCause()Ljava/lang/Throwable;
final String p3 = "Failed to call observer method"; // const-string p3, "Failed to call observer method"
/* invoke-direct {p2, p3, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V */
/* throw p2 */
} // .end method
public Boolean equals ( java.lang.Object p0 ) {
/* .locals 4 */
int v0 = 1; // const/4 v0, 0x1
/* if-ne p0, p1, :cond_0 */
/* .line 1 */
} // :cond_0
/* instance-of v1, p1, Lc/n/b; */
int v2 = 0; // const/4 v2, 0x0
/* if-nez v1, :cond_1 */
/* .line 2 */
} // :cond_1
/* check-cast p1, Lc/n/b; */
/* .line 3 */
/* iget v1, p0, Lc/n/b;->a:I */
/* iget v3, p1, Lc/n/b;->a:I */
/* if-ne v1, v3, :cond_2 */
v1 = this.b;
(( java.lang.reflect.Method ) v1 ).getName ( ); // invoke-virtual {v1}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;
p1 = this.b;
(( java.lang.reflect.Method ) p1 ).getName ( ); // invoke-virtual {p1}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;
p1 = (( java.lang.String ) v1 ).equals ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( p1 != null) { // if-eqz p1, :cond_2
} // :cond_2
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
} // .end method
public Integer hashCode ( ) {
/* .locals 2 */
/* .line 1 */
/* iget v0, p0, Lc/n/b;->a:I */
/* mul-int/lit8 v0, v0, 0x1f */
v1 = this.b;
(( java.lang.reflect.Method ) v1 ).getName ( ); // invoke-virtual {v1}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;
v1 = (( java.lang.String ) v1 ).hashCode ( ); // invoke-virtual {v1}, Ljava/lang/String;->hashCode()I
/* add-int/2addr v0, v1 */
} // .end method
