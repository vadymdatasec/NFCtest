public class inal implements java.lang.reflect.ParameterizedType implements java.io.Serializable {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public final java.lang.reflect.Type b;
	 public final java.lang.reflect.Type c;
	 public final java.lang.reflect.Type d;
	 /* # direct methods */
	 public inal ( ) {
		 /* .locals 4 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 2 */
		 /* instance-of v0, p2, Ljava/lang/Class; */
		 int v1 = 0; // const/4 v1, 0x0
		 if ( v0 != null) { // if-eqz v0, :cond_4
			 /* .line 3 */
			 /* move-object v0, p2 */
			 /* check-cast v0, Ljava/lang/Class; */
			 int v2 = 1; // const/4 v2, 0x1
			 /* if-nez p1, :cond_1 */
			 /* .line 4 */
			 (( java.lang.Class ) v0 ).getEnclosingClass ( ); // invoke-virtual {v0}, Ljava/lang/Class;->getEnclosingClass()Ljava/lang/Class;
			 /* if-nez v3, :cond_0 */
		 } // :cond_0
		 int v3 = 0; // const/4 v3, 0x0
	 } // :cond_1
} // :goto_0
int v3 = 1; // const/4 v3, 0x1
} // :goto_1
e.f.d.d0.a .a ( v3 );
if ( p1 != null) { // if-eqz p1, :cond_3
/* .line 5 */
(( java.lang.Class ) v0 ).getEnclosingClass ( ); // invoke-virtual {v0}, Ljava/lang/Class;->getEnclosingClass()Ljava/lang/Class;
if ( v0 != null) { // if-eqz v0, :cond_2
} // :cond_2
int v2 = 0; // const/4 v2, 0x0
} // :cond_3
} // :goto_2
e.f.d.d0.a .a ( v2 );
} // :cond_4
/* if-nez p1, :cond_5 */
int p1 = 0; // const/4 p1, 0x0
/* .line 6 */
} // :cond_5
e.f.d.d0.e .c ( p1 );
} // :goto_3
this.b = p1;
/* .line 7 */
e.f.d.d0.e .c ( p2 );
this.c = p1;
/* .line 8 */
(( java.lang.reflect.Type ) p3 ).clone ( ); // invoke-virtual {p3}, [Ljava/lang/reflect/Type;->clone()Ljava/lang/Object;
/* check-cast p1, [Ljava/lang/reflect/Type; */
this.d = p1;
/* .line 9 */
} // :goto_4
p1 = this.d;
/* array-length p2, p1 */
/* if-ge v1, p2, :cond_6 */
/* .line 10 */
/* aget-object p1, p1, v1 */
e.f.d.d0.a .a ( p1 );
/* .line 11 */
p1 = this.d;
/* aget-object p1, p1, v1 */
e.f.d.d0.e .a ( p1 );
/* .line 12 */
p1 = this.d;
/* aget-object p2, p1, v1 */
e.f.d.d0.e .c ( p2 );
/* aput-object p2, p1, v1 */
/* add-int/lit8 v1, v1, 0x1 */
} // :cond_6
return;
} // .end method
/* # virtual methods */
public Boolean equals ( java.lang.Object p0 ) {
/* .locals 1 */
/* .line 1 */
/* instance-of v0, p1, Ljava/lang/reflect/ParameterizedType; */
if ( v0 != null) { // if-eqz v0, :cond_0
/* check-cast p1, Ljava/lang/reflect/ParameterizedType; */
p1 = e.f.d.d0.e .a ( p0,p1 );
if ( p1 != null) { // if-eqz p1, :cond_0
int p1 = 1; // const/4 p1, 0x1
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
} // :goto_0
} // .end method
public java.lang.reflect.Type getActualTypeArguments ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.d;
(( java.lang.reflect.Type ) v0 ).clone ( ); // invoke-virtual {v0}, [Ljava/lang/reflect/Type;->clone()Ljava/lang/Object;
/* check-cast v0, [Ljava/lang/reflect/Type; */
} // .end method
public java.lang.reflect.Type getOwnerType ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.b;
} // .end method
public java.lang.reflect.Type getRawType ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.c;
} // .end method
public Integer hashCode ( ) {
/* .locals 2 */
/* .line 1 */
v0 = this.d;
v0 = java.util.Arrays .hashCode ( v0 );
v1 = this.c;
v1 = (( java.lang.Object ) v1 ).hashCode ( ); // invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I
/* xor-int/2addr v0, v1 */
v1 = this.b;
v1 = e.f.d.d0.e .a ( v1 );
/* xor-int/2addr v0, v1 */
} // .end method
public java.lang.String toString ( ) {
/* .locals 4 */
/* .line 1 */
/* new-instance v0, Ljava/lang/StringBuilder; */
v1 = this.d;
/* array-length v1, v1 */
int v2 = 1; // const/4 v2, 0x1
/* add-int/2addr v1, v2 */
/* mul-int/lit8 v1, v1, 0x1e */
/* invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V */
/* .line 2 */
v1 = this.c;
e.f.d.d0.e .i ( v1 );
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 3 */
v1 = this.d;
/* array-length v1, v1 */
/* if-nez v1, :cond_0 */
/* .line 4 */
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // :cond_0
final String v1 = "<"; // const-string v1, "<"
/* .line 5 */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v1 = this.d;
int v3 = 0; // const/4 v3, 0x0
/* aget-object v1, v1, v3 */
e.f.d.d0.e .i ( v1 );
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 6 */
} // :goto_0
v1 = this.d;
/* array-length v1, v1 */
/* if-ge v2, v1, :cond_1 */
final String v1 = ", "; // const-string v1, ", "
/* .line 7 */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v1 = this.d;
/* aget-object v1, v1, v2 */
e.f.d.d0.e .i ( v1 );
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* add-int/lit8 v2, v2, 0x1 */
} // :cond_1
final String v1 = ">"; // const-string v1, ">"
/* .line 8 */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // .end method
