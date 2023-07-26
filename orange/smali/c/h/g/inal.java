public class inal {
	 /* .source "SourceFile" */
	 /* # static fields */
	 public static final c.h.g.b e;
	 /* # instance fields */
	 public final Integer a;
	 public final Integer b;
	 public final Integer c;
	 public final Integer d;
	 /* # direct methods */
	 public static inal ( ) {
		 /* .locals 2 */
		 /* .line 1 */
		 /* new-instance v0, Lc/h/g/b; */
		 int v1 = 0; // const/4 v1, 0x0
		 /* invoke-direct {v0, v1, v1, v1, v1}, Lc/h/g/b;-><init>(IIII)V */
		 return;
	 } // .end method
	 public inal ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 2 */
		 /* iput p1, p0, Lc/h/g/b;->a:I */
		 /* .line 3 */
		 /* iput p2, p0, Lc/h/g/b;->b:I */
		 /* .line 4 */
		 /* iput p3, p0, Lc/h/g/b;->c:I */
		 /* .line 5 */
		 /* iput p4, p0, Lc/h/g/b;->d:I */
		 return;
	 } // .end method
	 public static c.h.g.b a ( Integer p0, Integer p1, Integer p2, Integer p3 ) {
		 /* .locals 1 */
		 /* if-nez p0, :cond_0 */
		 /* if-nez p1, :cond_0 */
		 /* if-nez p2, :cond_0 */
		 /* if-nez p3, :cond_0 */
		 /* .line 1 */
		 p0 = c.h.g.b.e;
		 /* .line 2 */
	 } // :cond_0
	 /* new-instance v0, Lc/h/g/b; */
	 /* invoke-direct {v0, p0, p1, p2, p3}, Lc/h/g/b;-><init>(IIII)V */
} // .end method
public static c.h.g.b a ( android.graphics.Insets p0 ) {
	 /* .locals 3 */
	 /* .line 7 */
	 /* iget v0, p0, Landroid/graphics/Insets;->left:I */
	 /* iget v1, p0, Landroid/graphics/Insets;->top:I */
	 /* iget v2, p0, Landroid/graphics/Insets;->right:I */
	 /* iget p0, p0, Landroid/graphics/Insets;->bottom:I */
	 c.h.g.b .a ( v0,v1,v2,p0 );
} // .end method
public static c.h.g.b a ( android.graphics.Rect p0 ) {
	 /* .locals 3 */
	 /* .line 3 */
	 /* iget v0, p0, Landroid/graphics/Rect;->left:I */
	 /* iget v1, p0, Landroid/graphics/Rect;->top:I */
	 /* iget v2, p0, Landroid/graphics/Rect;->right:I */
	 /* iget p0, p0, Landroid/graphics/Rect;->bottom:I */
	 c.h.g.b .a ( v0,v1,v2,p0 );
} // .end method
public static c.h.g.b a ( Object p0, Object p1 ) {
	 /* .locals 4 */
	 /* .line 4 */
	 /* iget v0, p0, Lc/h/g/b;->a:I */
	 /* iget v1, p1, Lc/h/g/b;->a:I */
	 v0 = 	 java.lang.Math .max ( v0,v1 );
	 /* iget v1, p0, Lc/h/g/b;->b:I */
	 /* iget v2, p1, Lc/h/g/b;->b:I */
	 v1 = 	 java.lang.Math .max ( v1,v2 );
	 /* iget v2, p0, Lc/h/g/b;->c:I */
	 /* iget v3, p1, Lc/h/g/b;->c:I */
	 /* .line 5 */
	 v2 = 	 java.lang.Math .max ( v2,v3 );
	 /* iget p0, p0, Lc/h/g/b;->d:I */
	 /* iget p1, p1, Lc/h/g/b;->d:I */
	 p0 = 	 java.lang.Math .max ( p0,p1 );
	 /* .line 6 */
	 c.h.g.b .a ( v0,v1,v2,p0 );
} // .end method
/* # virtual methods */
public android.graphics.Insets a ( ) {
	 /* .locals 4 */
	 /* .line 8 */
	 /* iget v0, p0, Lc/h/g/b;->a:I */
	 /* iget v1, p0, Lc/h/g/b;->b:I */
	 /* iget v2, p0, Lc/h/g/b;->c:I */
	 /* iget v3, p0, Lc/h/g/b;->d:I */
	 android.graphics.Insets .of ( v0,v1,v2,v3 );
} // .end method
public Boolean equals ( java.lang.Object p0 ) {
	 /* .locals 4 */
	 int v0 = 1; // const/4 v0, 0x1
	 /* if-ne p0, p1, :cond_0 */
} // :cond_0
int v1 = 0; // const/4 v1, 0x0
if ( p1 != null) { // if-eqz p1, :cond_6
	 /* .line 1 */
	 /* const-class v2, Lc/h/g/b; */
	 (( java.lang.Object ) p1 ).getClass ( ); // invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
	 /* if-eq v2, v3, :cond_1 */
	 /* .line 2 */
} // :cond_1
/* check-cast p1, Lc/h/g/b; */
/* .line 3 */
/* iget v2, p0, Lc/h/g/b;->d:I */
/* iget v3, p1, Lc/h/g/b;->d:I */
/* if-eq v2, v3, :cond_2 */
/* .line 4 */
} // :cond_2
/* iget v2, p0, Lc/h/g/b;->a:I */
/* iget v3, p1, Lc/h/g/b;->a:I */
/* if-eq v2, v3, :cond_3 */
/* .line 5 */
} // :cond_3
/* iget v2, p0, Lc/h/g/b;->c:I */
/* iget v3, p1, Lc/h/g/b;->c:I */
/* if-eq v2, v3, :cond_4 */
/* .line 6 */
} // :cond_4
/* iget v2, p0, Lc/h/g/b;->b:I */
/* iget p1, p1, Lc/h/g/b;->b:I */
/* if-eq v2, p1, :cond_5 */
} // :cond_5
} // :cond_6
} // :goto_0
} // .end method
public Integer hashCode ( ) {
/* .locals 2 */
/* .line 1 */
/* iget v0, p0, Lc/h/g/b;->a:I */
/* mul-int/lit8 v0, v0, 0x1f */
/* .line 2 */
/* iget v1, p0, Lc/h/g/b;->b:I */
/* add-int/2addr v0, v1 */
/* mul-int/lit8 v0, v0, 0x1f */
/* .line 3 */
/* iget v1, p0, Lc/h/g/b;->c:I */
/* add-int/2addr v0, v1 */
/* mul-int/lit8 v0, v0, 0x1f */
/* .line 4 */
/* iget v1, p0, Lc/h/g/b;->d:I */
/* add-int/2addr v0, v1 */
} // .end method
public java.lang.String toString ( ) {
/* .locals 2 */
/* .line 1 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
final String v1 = "Insets{left="; // const-string v1, "Insets{left="
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* iget v1, p0, Lc/h/g/b;->a:I */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v1 = ", top="; // const-string v1, ", top="
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* iget v1, p0, Lc/h/g/b;->b:I */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v1 = ", right="; // const-string v1, ", right="
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* iget v1, p0, Lc/h/g/b;->c:I */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v1 = ", bottom="; // const-string v1, ", bottom="
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* iget v1, p0, Lc/h/g/b;->d:I */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
/* const/16 v1, 0x7d */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // .end method
