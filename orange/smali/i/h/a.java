public abstract class i.h.a {
	 /* .source "SourceFile" */
	 /* # direct methods */
	 public static final java.lang.Class a ( Object p0 ) {
		 /* .locals 3 */
		 /* .annotation system Ldalvik/annotation/Signature; */
		 /* value = { */
		 /* "<T:", */
		 /* "Ljava/lang/Object;", */
		 /* ">(", */
		 /* "Li/j/b<", */
		 /* "TT;>;)", */
		 /* "Ljava/lang/Class<", */
		 /* "TT;>;" */
		 /* } */
	 } // .end annotation
	 final String v0 = "$this$javaObjectType"; // const-string v0, "$this$javaObjectType"
	 i.h.c.k .c ( p0,v0 );
	 /* .line 1 */
	 /* check-cast p0, Li/h/c/c; */
	 /* .line 2 */
	 v0 = 	 (( java.lang.Class ) p0 ).isPrimitive ( ); // invoke-virtual {p0}, Ljava/lang/Class;->isPrimitive()Z
	 final String v1 = "null cannot be cast to non-null type java.lang.Class<T>"; // const-string v1, "null cannot be cast to non-null type java.lang.Class<T>"
	 /* if-nez v0, :cond_1 */
	 if ( p0 != null) { // if-eqz p0, :cond_0
	 } // :cond_0
	 /* new-instance p0, Ljava/lang/NullPointerException; */
	 /* invoke-direct {p0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V */
	 /* throw p0 */
	 /* .line 3 */
} // :cond_1
(( java.lang.Class ) p0 ).getName ( ); // invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;
/* if-nez v0, :cond_2 */
/* goto/16 :goto_0 */
} // :cond_2
v2 = (( java.lang.String ) v0 ).hashCode ( ); // invoke-virtual {v0}, Ljava/lang/String;->hashCode()I
/* sparse-switch v2, :sswitch_data_0 */
/* :sswitch_0 */
final String v2 = "short"; // const-string v2, "short"
/* .line 4 */
v0 = (( java.lang.String ) v0 ).equals ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v0 != null) { // if-eqz v0, :cond_3
/* const-class p0, Ljava/lang/Short; */
/* :sswitch_1 */
final String v2 = "float"; // const-string v2, "float"
/* .line 5 */
v0 = (( java.lang.String ) v0 ).equals ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v0 != null) { // if-eqz v0, :cond_3
	 /* const-class p0, Ljava/lang/Float; */
	 /* :sswitch_2 */
	 final String v2 = "boolean"; // const-string v2, "boolean"
	 /* .line 6 */
	 v0 = 	 (( java.lang.String ) v0 ).equals ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
	 if ( v0 != null) { // if-eqz v0, :cond_3
		 /* const-class p0, Ljava/lang/Boolean; */
		 /* :sswitch_3 */
		 final String v2 = "void"; // const-string v2, "void"
		 /* .line 7 */
		 v0 = 		 (( java.lang.String ) v0 ).equals ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
		 if ( v0 != null) { // if-eqz v0, :cond_3
			 /* const-class p0, Ljava/lang/Void; */
			 /* :sswitch_4 */
			 final String v2 = "long"; // const-string v2, "long"
			 /* .line 8 */
			 v0 = 			 (( java.lang.String ) v0 ).equals ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
			 if ( v0 != null) { // if-eqz v0, :cond_3
				 /* const-class p0, Ljava/lang/Long; */
				 /* :sswitch_5 */
				 final String v2 = "char"; // const-string v2, "char"
				 /* .line 9 */
				 v0 = 				 (( java.lang.String ) v0 ).equals ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
				 if ( v0 != null) { // if-eqz v0, :cond_3
					 /* const-class p0, Ljava/lang/Character; */
					 /* :sswitch_6 */
					 final String v2 = "byte"; // const-string v2, "byte"
					 /* .line 10 */
					 v0 = 					 (( java.lang.String ) v0 ).equals ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
					 if ( v0 != null) { // if-eqz v0, :cond_3
						 /* const-class p0, Ljava/lang/Byte; */
						 /* :sswitch_7 */
						 final String v2 = "int"; // const-string v2, "int"
						 /* .line 11 */
						 v0 = 						 (( java.lang.String ) v0 ).equals ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
						 if ( v0 != null) { // if-eqz v0, :cond_3
							 /* const-class p0, Ljava/lang/Integer; */
							 /* :sswitch_8 */
							 final String v2 = "double"; // const-string v2, "double"
							 /* .line 12 */
							 v0 = 							 (( java.lang.String ) v0 ).equals ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
							 if ( v0 != null) { // if-eqz v0, :cond_3
								 /* const-class p0, Ljava/lang/Double; */
							 } // :cond_3
						 } // :goto_0
						 if ( p0 != null) { // if-eqz p0, :cond_4
							 /* .line 13 */
						 } // :cond_4
						 /* new-instance p0, Ljava/lang/NullPointerException; */
						 /* invoke-direct {p0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V */
						 /* throw p0 */
						 /* nop */
						 /* :sswitch_data_0 */
						 /* .sparse-switch */
						 /* -0x4f08842f -> :sswitch_8 */
						 /* 0x197ef -> :sswitch_7 */
						 /* 0x2e6108 -> :sswitch_6 */
						 /* 0x2e9356 -> :sswitch_5 */
						 /* 0x32c67c -> :sswitch_4 */
						 /* 0x375194 -> :sswitch_3 */
						 /* 0x3db6c28 -> :sswitch_2 */
						 /* 0x5d0225c -> :sswitch_1 */
						 /* 0x685847c -> :sswitch_0 */
					 } // .end sparse-switch
				 } // .end method
