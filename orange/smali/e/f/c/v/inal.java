public class inal extends e.f.c.v.f {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public final java.lang.String a;
	 public final java.lang.String b;
	 /* # direct methods */
	 public inal ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Le/f/c/v/f;-><init>()V */
		 if ( p1 != null) { // if-eqz p1, :cond_1
			 /* .line 2 */
			 this.a = p1;
			 if ( p2 != null) { // if-eqz p2, :cond_0
				 /* .line 3 */
				 this.b = p2;
				 return;
				 /* .line 4 */
			 } // :cond_0
			 /* new-instance p1, Ljava/lang/NullPointerException; */
			 final String p2 = "Null version"; // const-string p2, "Null version"
			 /* invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V */
			 /* throw p1 */
			 /* .line 5 */
		 } // :cond_1
		 /* new-instance p1, Ljava/lang/NullPointerException; */
		 final String p2 = "Null libraryName"; // const-string p2, "Null libraryName"
		 /* invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V */
		 /* throw p1 */
	 } // .end method
	 /* # virtual methods */
	 public java.lang.String a ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 v0 = this.a;
	 } // .end method
	 public java.lang.String b ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 v0 = this.b;
	 } // .end method
	 public Boolean equals ( java.lang.Object p0 ) {
		 /* .locals 4 */
		 int v0 = 1; // const/4 v0, 0x1
		 /* if-ne p1, p0, :cond_0 */
		 /* .line 1 */
	 } // :cond_0
	 /* instance-of v1, p1, Le/f/c/v/f; */
	 int v2 = 0; // const/4 v2, 0x0
	 if ( v1 != null) { // if-eqz v1, :cond_2
		 /* .line 2 */
		 /* check-cast p1, Le/f/c/v/f; */
		 /* .line 3 */
		 v1 = this.a;
		 (( e.f.c.v.f ) p1 ).a ( ); // invoke-virtual {p1}, Le/f/c/v/f;->a()Ljava/lang/String;
		 v1 = 		 (( java.lang.String ) v1 ).equals ( v3 ); // invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
		 if ( v1 != null) { // if-eqz v1, :cond_1
			 v1 = this.b;
			 /* .line 4 */
			 (( e.f.c.v.f ) p1 ).b ( ); // invoke-virtual {p1}, Le/f/c/v/f;->b()Ljava/lang/String;
			 p1 = 			 (( java.lang.String ) v1 ).equals ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
			 if ( p1 != null) { // if-eqz p1, :cond_1
			 } // :cond_1
			 int v0 = 0; // const/4 v0, 0x0
		 } // :goto_0
	 } // :cond_2
} // .end method
public Integer hashCode ( ) {
	 /* .locals 2 */
	 /* .line 1 */
	 v0 = this.a;
	 v0 = 	 (( java.lang.String ) v0 ).hashCode ( ); // invoke-virtual {v0}, Ljava/lang/String;->hashCode()I
	 /* const v1, 0xf4243 */
	 /* xor-int/2addr v0, v1 */
	 /* mul-int v0, v0, v1 */
	 /* .line 2 */
	 v1 = this.b;
	 v1 = 	 (( java.lang.String ) v1 ).hashCode ( ); // invoke-virtual {v1}, Ljava/lang/String;->hashCode()I
	 /* xor-int/2addr v0, v1 */
} // .end method
public java.lang.String toString ( ) {
	 /* .locals 2 */
	 /* .line 1 */
	 /* new-instance v0, Ljava/lang/StringBuilder; */
	 /* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
	 final String v1 = "LibraryVersion{libraryName="; // const-string v1, "LibraryVersion{libraryName="
	 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 v1 = this.a;
	 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 final String v1 = ", version="; // const-string v1, ", version="
	 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 v1 = this.b;
	 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 final String v1 = "}"; // const-string v1, "}"
	 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // .end method
