public class inal {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public final android.text.TextPaint a;
	 public final android.text.TextDirectionHeuristic b;
	 public final Integer c;
	 public final Integer d;
	 /* # direct methods */
	 public inal ( ) {
		 /* .locals 1 */
		 /* .line 12 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 13 */
		 (( android.text.PrecomputedText$Params ) p1 ).getTextPaint ( ); // invoke-virtual {p1}, Landroid/text/PrecomputedText$Params;->getTextPaint()Landroid/text/TextPaint;
		 this.a = v0;
		 /* .line 14 */
		 (( android.text.PrecomputedText$Params ) p1 ).getTextDirection ( ); // invoke-virtual {p1}, Landroid/text/PrecomputedText$Params;->getTextDirection()Landroid/text/TextDirectionHeuristic;
		 this.b = v0;
		 /* .line 15 */
		 v0 = 		 (( android.text.PrecomputedText$Params ) p1 ).getBreakStrategy ( ); // invoke-virtual {p1}, Landroid/text/PrecomputedText$Params;->getBreakStrategy()I
		 /* iput v0, p0, Lc/h/l/b;->c:I */
		 /* .line 16 */
		 p1 = 		 (( android.text.PrecomputedText$Params ) p1 ).getHyphenationFrequency ( ); // invoke-virtual {p1}, Landroid/text/PrecomputedText$Params;->getHyphenationFrequency()I
		 /* iput p1, p0, Lc/h/l/b;->d:I */
		 /* .line 17 */
		 /* const/16 v0, 0x1d */
		 return;
	 } // .end method
	 public inal ( ) {
		 /* .locals 2 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 2 */
		 /* const/16 v1, 0x1d */
		 /* if-lt v0, v1, :cond_0 */
		 /* .line 3 */
		 /* new-instance v0, Landroid/text/PrecomputedText$Params$Builder; */
		 /* invoke-direct {v0, p1}, Landroid/text/PrecomputedText$Params$Builder;-><init>(Landroid/text/TextPaint;)V */
		 /* .line 4 */
		 (( android.text.PrecomputedText$Params$Builder ) v0 ).setBreakStrategy ( p3 ); // invoke-virtual {v0, p3}, Landroid/text/PrecomputedText$Params$Builder;->setBreakStrategy(I)Landroid/text/PrecomputedText$Params$Builder;
		 /* .line 5 */
		 (( android.text.PrecomputedText$Params$Builder ) v0 ).setHyphenationFrequency ( p4 ); // invoke-virtual {v0, p4}, Landroid/text/PrecomputedText$Params$Builder;->setHyphenationFrequency(I)Landroid/text/PrecomputedText$Params$Builder;
		 /* .line 6 */
		 (( android.text.PrecomputedText$Params$Builder ) v0 ).setTextDirection ( p2 ); // invoke-virtual {v0, p2}, Landroid/text/PrecomputedText$Params$Builder;->setTextDirection(Landroid/text/TextDirectionHeuristic;)Landroid/text/PrecomputedText$Params$Builder;
		 /* .line 7 */
		 (( android.text.PrecomputedText$Params$Builder ) v0 ).build ( ); // invoke-virtual {v0}, Landroid/text/PrecomputedText$Params$Builder;->build()Landroid/text/PrecomputedText$Params;
		 /* .line 8 */
	 } // :cond_0
	 this.a = p1;
	 /* .line 9 */
	 this.b = p2;
	 /* .line 10 */
	 /* iput p3, p0, Lc/h/l/b;->c:I */
	 /* .line 11 */
	 /* iput p4, p0, Lc/h/l/b;->d:I */
	 return;
} // .end method
/* # virtual methods */
public Integer a ( ) {
	 /* .locals 1 */
	 /* .line 1 */
	 /* iget v0, p0, Lc/h/l/b;->c:I */
} // .end method
public Boolean a ( Object p0 ) {
	 /* .locals 3 */
	 /* .line 2 */
	 int v1 = 0; // const/4 v1, 0x0
	 /* const/16 v2, 0x17 */
	 /* if-lt v0, v2, :cond_1 */
	 /* .line 3 */
	 /* iget v0, p0, Lc/h/l/b;->c:I */
	 v2 = 	 (( c.h.l.b ) p1 ).a ( ); // invoke-virtual {p1}, Lc/h/l/b;->a()I
	 /* if-eq v0, v2, :cond_0 */
	 /* .line 4 */
} // :cond_0
/* iget v0, p0, Lc/h/l/b;->d:I */
v2 = (( c.h.l.b ) p1 ).b ( ); // invoke-virtual {p1}, Lc/h/l/b;->b()I
/* if-eq v0, v2, :cond_1 */
/* .line 5 */
} // :cond_1
v0 = this.a;
v0 = (( android.text.TextPaint ) v0 ).getTextSize ( ); // invoke-virtual {v0}, Landroid/text/TextPaint;->getTextSize()F
(( c.h.l.b ) p1 ).d ( ); // invoke-virtual {p1}, Lc/h/l/b;->d()Landroid/text/TextPaint;
v2 = (( android.text.TextPaint ) v2 ).getTextSize ( ); // invoke-virtual {v2}, Landroid/text/TextPaint;->getTextSize()F
/* cmpl-float v0, v0, v2 */
if ( v0 != null) { // if-eqz v0, :cond_2
/* .line 6 */
} // :cond_2
v0 = this.a;
v0 = (( android.text.TextPaint ) v0 ).getTextScaleX ( ); // invoke-virtual {v0}, Landroid/text/TextPaint;->getTextScaleX()F
(( c.h.l.b ) p1 ).d ( ); // invoke-virtual {p1}, Lc/h/l/b;->d()Landroid/text/TextPaint;
v2 = (( android.text.TextPaint ) v2 ).getTextScaleX ( ); // invoke-virtual {v2}, Landroid/text/TextPaint;->getTextScaleX()F
/* cmpl-float v0, v0, v2 */
if ( v0 != null) { // if-eqz v0, :cond_3
/* .line 7 */
} // :cond_3
v0 = this.a;
v0 = (( android.text.TextPaint ) v0 ).getTextSkewX ( ); // invoke-virtual {v0}, Landroid/text/TextPaint;->getTextSkewX()F
(( c.h.l.b ) p1 ).d ( ); // invoke-virtual {p1}, Lc/h/l/b;->d()Landroid/text/TextPaint;
v2 = (( android.text.TextPaint ) v2 ).getTextSkewX ( ); // invoke-virtual {v2}, Landroid/text/TextPaint;->getTextSkewX()F
/* cmpl-float v0, v0, v2 */
if ( v0 != null) { // if-eqz v0, :cond_4
/* .line 8 */
} // :cond_4
/* const/16 v2, 0x15 */
/* if-lt v0, v2, :cond_6 */
/* .line 9 */
v0 = this.a;
v0 = (( android.text.TextPaint ) v0 ).getLetterSpacing ( ); // invoke-virtual {v0}, Landroid/text/TextPaint;->getLetterSpacing()F
(( c.h.l.b ) p1 ).d ( ); // invoke-virtual {p1}, Lc/h/l/b;->d()Landroid/text/TextPaint;
v2 = (( android.text.TextPaint ) v2 ).getLetterSpacing ( ); // invoke-virtual {v2}, Landroid/text/TextPaint;->getLetterSpacing()F
/* cmpl-float v0, v0, v2 */
if ( v0 != null) { // if-eqz v0, :cond_5
/* .line 10 */
} // :cond_5
v0 = this.a;
(( android.text.TextPaint ) v0 ).getFontFeatureSettings ( ); // invoke-virtual {v0}, Landroid/text/TextPaint;->getFontFeatureSettings()Ljava/lang/String;
/* .line 11 */
(( c.h.l.b ) p1 ).d ( ); // invoke-virtual {p1}, Lc/h/l/b;->d()Landroid/text/TextPaint;
(( android.text.TextPaint ) v2 ).getFontFeatureSettings ( ); // invoke-virtual {v2}, Landroid/text/TextPaint;->getFontFeatureSettings()Ljava/lang/String;
/* .line 12 */
v0 = android.text.TextUtils .equals ( v0,v2 );
/* if-nez v0, :cond_6 */
/* .line 13 */
} // :cond_6
v0 = this.a;
v0 = (( android.text.TextPaint ) v0 ).getFlags ( ); // invoke-virtual {v0}, Landroid/text/TextPaint;->getFlags()I
(( c.h.l.b ) p1 ).d ( ); // invoke-virtual {p1}, Lc/h/l/b;->d()Landroid/text/TextPaint;
v2 = (( android.text.TextPaint ) v2 ).getFlags ( ); // invoke-virtual {v2}, Landroid/text/TextPaint;->getFlags()I
/* if-eq v0, v2, :cond_7 */
/* .line 14 */
} // :cond_7
/* const/16 v2, 0x18 */
/* if-lt v0, v2, :cond_8 */
/* .line 15 */
v0 = this.a;
(( android.text.TextPaint ) v0 ).getTextLocales ( ); // invoke-virtual {v0}, Landroid/text/TextPaint;->getTextLocales()Landroid/os/LocaleList;
(( c.h.l.b ) p1 ).d ( ); // invoke-virtual {p1}, Lc/h/l/b;->d()Landroid/text/TextPaint;
(( android.text.TextPaint ) v2 ).getTextLocales ( ); // invoke-virtual {v2}, Landroid/text/TextPaint;->getTextLocales()Landroid/os/LocaleList;
v0 = (( android.os.LocaleList ) v0 ).equals ( v2 ); // invoke-virtual {v0, v2}, Landroid/os/LocaleList;->equals(Ljava/lang/Object;)Z
/* if-nez v0, :cond_9 */
} // :cond_8
/* const/16 v2, 0x11 */
/* if-lt v0, v2, :cond_9 */
/* .line 16 */
v0 = this.a;
(( android.text.TextPaint ) v0 ).getTextLocale ( ); // invoke-virtual {v0}, Landroid/text/TextPaint;->getTextLocale()Ljava/util/Locale;
(( c.h.l.b ) p1 ).d ( ); // invoke-virtual {p1}, Lc/h/l/b;->d()Landroid/text/TextPaint;
(( android.text.TextPaint ) v2 ).getTextLocale ( ); // invoke-virtual {v2}, Landroid/text/TextPaint;->getTextLocale()Ljava/util/Locale;
v0 = (( java.util.Locale ) v0 ).equals ( v2 ); // invoke-virtual {v0, v2}, Ljava/util/Locale;->equals(Ljava/lang/Object;)Z
/* if-nez v0, :cond_9 */
/* .line 17 */
} // :cond_9
v0 = this.a;
(( android.text.TextPaint ) v0 ).getTypeface ( ); // invoke-virtual {v0}, Landroid/text/TextPaint;->getTypeface()Landroid/graphics/Typeface;
/* if-nez v0, :cond_a */
/* .line 18 */
(( c.h.l.b ) p1 ).d ( ); // invoke-virtual {p1}, Lc/h/l/b;->d()Landroid/text/TextPaint;
(( android.text.TextPaint ) p1 ).getTypeface ( ); // invoke-virtual {p1}, Landroid/text/TextPaint;->getTypeface()Landroid/graphics/Typeface;
if ( p1 != null) { // if-eqz p1, :cond_b
/* .line 19 */
} // :cond_a
v0 = this.a;
(( android.text.TextPaint ) v0 ).getTypeface ( ); // invoke-virtual {v0}, Landroid/text/TextPaint;->getTypeface()Landroid/graphics/Typeface;
(( c.h.l.b ) p1 ).d ( ); // invoke-virtual {p1}, Lc/h/l/b;->d()Landroid/text/TextPaint;
(( android.text.TextPaint ) p1 ).getTypeface ( ); // invoke-virtual {p1}, Landroid/text/TextPaint;->getTypeface()Landroid/graphics/Typeface;
p1 = (( android.graphics.Typeface ) v0 ).equals ( p1 ); // invoke-virtual {v0, p1}, Landroid/graphics/Typeface;->equals(Ljava/lang/Object;)Z
/* if-nez p1, :cond_b */
} // :cond_b
int p1 = 1; // const/4 p1, 0x1
} // .end method
public Integer b ( ) {
/* .locals 1 */
/* .line 1 */
/* iget v0, p0, Lc/h/l/b;->d:I */
} // .end method
public android.text.TextDirectionHeuristic c ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.b;
} // .end method
public android.text.TextPaint d ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.a;
} // .end method
public Boolean equals ( java.lang.Object p0 ) {
/* .locals 4 */
int v0 = 1; // const/4 v0, 0x1
/* if-ne p1, p0, :cond_0 */
/* .line 1 */
} // :cond_0
/* instance-of v1, p1, Lc/h/l/b; */
int v2 = 0; // const/4 v2, 0x0
/* if-nez v1, :cond_1 */
/* .line 2 */
} // :cond_1
/* check-cast p1, Lc/h/l/b; */
/* .line 3 */
v1 = (( c.h.l.b ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Lc/h/l/b;->a(Lc/h/l/b;)Z
/* if-nez v1, :cond_2 */
/* .line 4 */
} // :cond_2
/* const/16 v3, 0x12 */
/* if-lt v1, v3, :cond_3 */
/* .line 5 */
v1 = this.b;
(( c.h.l.b ) p1 ).c ( ); // invoke-virtual {p1}, Lc/h/l/b;->c()Landroid/text/TextDirectionHeuristic;
/* if-eq v1, p1, :cond_3 */
} // :cond_3
} // .end method
public Integer hashCode ( ) {
/* .locals 14 */
/* .line 1 */
/* const/16 v1, 0xa */
/* const/16 v2, 0xb */
/* const/16 v3, 0x9 */
/* const/16 v4, 0x8 */
int v5 = 7; // const/4 v5, 0x7
int v6 = 6; // const/4 v6, 0x6
int v7 = 5; // const/4 v7, 0x5
int v8 = 4; // const/4 v8, 0x4
int v9 = 3; // const/4 v9, 0x3
int v10 = 2; // const/4 v10, 0x2
int v11 = 1; // const/4 v11, 0x1
int v12 = 0; // const/4 v12, 0x0
/* const/16 v13, 0x18 */
/* if-lt v0, v13, :cond_0 */
/* new-array v0, v2, [Ljava/lang/Object; */
/* .line 2 */
v2 = this.a;
v2 = (( android.text.TextPaint ) v2 ).getTextSize ( ); // invoke-virtual {v2}, Landroid/text/TextPaint;->getTextSize()F
java.lang.Float .valueOf ( v2 );
/* aput-object v2, v0, v12 */
v2 = this.a;
v2 = (( android.text.TextPaint ) v2 ).getTextScaleX ( ); // invoke-virtual {v2}, Landroid/text/TextPaint;->getTextScaleX()F
java.lang.Float .valueOf ( v2 );
/* aput-object v2, v0, v11 */
v2 = this.a;
/* .line 3 */
v2 = (( android.text.TextPaint ) v2 ).getTextSkewX ( ); // invoke-virtual {v2}, Landroid/text/TextPaint;->getTextSkewX()F
java.lang.Float .valueOf ( v2 );
/* aput-object v2, v0, v10 */
v2 = this.a;
v2 = (( android.text.TextPaint ) v2 ).getLetterSpacing ( ); // invoke-virtual {v2}, Landroid/text/TextPaint;->getLetterSpacing()F
java.lang.Float .valueOf ( v2 );
/* aput-object v2, v0, v9 */
v2 = this.a;
v2 = (( android.text.TextPaint ) v2 ).getFlags ( ); // invoke-virtual {v2}, Landroid/text/TextPaint;->getFlags()I
java.lang.Integer .valueOf ( v2 );
/* aput-object v2, v0, v8 */
v2 = this.a;
/* .line 4 */
(( android.text.TextPaint ) v2 ).getTextLocales ( ); // invoke-virtual {v2}, Landroid/text/TextPaint;->getTextLocales()Landroid/os/LocaleList;
/* aput-object v2, v0, v7 */
v2 = this.a;
(( android.text.TextPaint ) v2 ).getTypeface ( ); // invoke-virtual {v2}, Landroid/text/TextPaint;->getTypeface()Landroid/graphics/Typeface;
/* aput-object v2, v0, v6 */
v2 = this.a;
v2 = (( android.text.TextPaint ) v2 ).isElegantTextHeight ( ); // invoke-virtual {v2}, Landroid/text/TextPaint;->isElegantTextHeight()Z
java.lang.Boolean .valueOf ( v2 );
/* aput-object v2, v0, v5 */
v2 = this.b;
/* aput-object v2, v0, v4 */
/* iget v2, p0, Lc/h/l/b;->c:I */
/* .line 5 */
java.lang.Integer .valueOf ( v2 );
/* aput-object v2, v0, v3 */
/* iget v2, p0, Lc/h/l/b;->d:I */
java.lang.Integer .valueOf ( v2 );
/* aput-object v2, v0, v1 */
/* .line 6 */
v0 = c.h.m.c .a ( v0 );
} // :cond_0
/* const/16 v13, 0x15 */
/* if-lt v0, v13, :cond_1 */
/* new-array v0, v2, [Ljava/lang/Object; */
/* .line 7 */
v2 = this.a;
v2 = (( android.text.TextPaint ) v2 ).getTextSize ( ); // invoke-virtual {v2}, Landroid/text/TextPaint;->getTextSize()F
java.lang.Float .valueOf ( v2 );
/* aput-object v2, v0, v12 */
v2 = this.a;
v2 = (( android.text.TextPaint ) v2 ).getTextScaleX ( ); // invoke-virtual {v2}, Landroid/text/TextPaint;->getTextScaleX()F
java.lang.Float .valueOf ( v2 );
/* aput-object v2, v0, v11 */
v2 = this.a;
/* .line 8 */
v2 = (( android.text.TextPaint ) v2 ).getTextSkewX ( ); // invoke-virtual {v2}, Landroid/text/TextPaint;->getTextSkewX()F
java.lang.Float .valueOf ( v2 );
/* aput-object v2, v0, v10 */
v2 = this.a;
v2 = (( android.text.TextPaint ) v2 ).getLetterSpacing ( ); // invoke-virtual {v2}, Landroid/text/TextPaint;->getLetterSpacing()F
java.lang.Float .valueOf ( v2 );
/* aput-object v2, v0, v9 */
v2 = this.a;
v2 = (( android.text.TextPaint ) v2 ).getFlags ( ); // invoke-virtual {v2}, Landroid/text/TextPaint;->getFlags()I
java.lang.Integer .valueOf ( v2 );
/* aput-object v2, v0, v8 */
v2 = this.a;
/* .line 9 */
(( android.text.TextPaint ) v2 ).getTextLocale ( ); // invoke-virtual {v2}, Landroid/text/TextPaint;->getTextLocale()Ljava/util/Locale;
/* aput-object v2, v0, v7 */
v2 = this.a;
(( android.text.TextPaint ) v2 ).getTypeface ( ); // invoke-virtual {v2}, Landroid/text/TextPaint;->getTypeface()Landroid/graphics/Typeface;
/* aput-object v2, v0, v6 */
v2 = this.a;
v2 = (( android.text.TextPaint ) v2 ).isElegantTextHeight ( ); // invoke-virtual {v2}, Landroid/text/TextPaint;->isElegantTextHeight()Z
java.lang.Boolean .valueOf ( v2 );
/* aput-object v2, v0, v5 */
v2 = this.b;
/* aput-object v2, v0, v4 */
/* iget v2, p0, Lc/h/l/b;->c:I */
/* .line 10 */
java.lang.Integer .valueOf ( v2 );
/* aput-object v2, v0, v3 */
/* iget v2, p0, Lc/h/l/b;->d:I */
java.lang.Integer .valueOf ( v2 );
/* aput-object v2, v0, v1 */
/* .line 11 */
v0 = c.h.m.c .a ( v0 );
} // :cond_1
/* const/16 v1, 0x12 */
/* if-lt v0, v1, :cond_2 */
/* new-array v0, v3, [Ljava/lang/Object; */
/* .line 12 */
v1 = this.a;
v1 = (( android.text.TextPaint ) v1 ).getTextSize ( ); // invoke-virtual {v1}, Landroid/text/TextPaint;->getTextSize()F
java.lang.Float .valueOf ( v1 );
/* aput-object v1, v0, v12 */
v1 = this.a;
v1 = (( android.text.TextPaint ) v1 ).getTextScaleX ( ); // invoke-virtual {v1}, Landroid/text/TextPaint;->getTextScaleX()F
java.lang.Float .valueOf ( v1 );
/* aput-object v1, v0, v11 */
v1 = this.a;
/* .line 13 */
v1 = (( android.text.TextPaint ) v1 ).getTextSkewX ( ); // invoke-virtual {v1}, Landroid/text/TextPaint;->getTextSkewX()F
java.lang.Float .valueOf ( v1 );
/* aput-object v1, v0, v10 */
v1 = this.a;
v1 = (( android.text.TextPaint ) v1 ).getFlags ( ); // invoke-virtual {v1}, Landroid/text/TextPaint;->getFlags()I
java.lang.Integer .valueOf ( v1 );
/* aput-object v1, v0, v9 */
v1 = this.a;
(( android.text.TextPaint ) v1 ).getTextLocale ( ); // invoke-virtual {v1}, Landroid/text/TextPaint;->getTextLocale()Ljava/util/Locale;
/* aput-object v1, v0, v8 */
v1 = this.a;
/* .line 14 */
(( android.text.TextPaint ) v1 ).getTypeface ( ); // invoke-virtual {v1}, Landroid/text/TextPaint;->getTypeface()Landroid/graphics/Typeface;
/* aput-object v1, v0, v7 */
v1 = this.b;
/* aput-object v1, v0, v6 */
/* iget v1, p0, Lc/h/l/b;->c:I */
java.lang.Integer .valueOf ( v1 );
/* aput-object v1, v0, v5 */
/* iget v1, p0, Lc/h/l/b;->d:I */
java.lang.Integer .valueOf ( v1 );
/* aput-object v1, v0, v4 */
/* .line 15 */
v0 = c.h.m.c .a ( v0 );
} // :cond_2
/* const/16 v1, 0x11 */
/* if-lt v0, v1, :cond_3 */
/* new-array v0, v3, [Ljava/lang/Object; */
/* .line 16 */
v1 = this.a;
v1 = (( android.text.TextPaint ) v1 ).getTextSize ( ); // invoke-virtual {v1}, Landroid/text/TextPaint;->getTextSize()F
java.lang.Float .valueOf ( v1 );
/* aput-object v1, v0, v12 */
v1 = this.a;
v1 = (( android.text.TextPaint ) v1 ).getTextScaleX ( ); // invoke-virtual {v1}, Landroid/text/TextPaint;->getTextScaleX()F
java.lang.Float .valueOf ( v1 );
/* aput-object v1, v0, v11 */
v1 = this.a;
/* .line 17 */
v1 = (( android.text.TextPaint ) v1 ).getTextSkewX ( ); // invoke-virtual {v1}, Landroid/text/TextPaint;->getTextSkewX()F
java.lang.Float .valueOf ( v1 );
/* aput-object v1, v0, v10 */
v1 = this.a;
v1 = (( android.text.TextPaint ) v1 ).getFlags ( ); // invoke-virtual {v1}, Landroid/text/TextPaint;->getFlags()I
java.lang.Integer .valueOf ( v1 );
/* aput-object v1, v0, v9 */
v1 = this.a;
(( android.text.TextPaint ) v1 ).getTextLocale ( ); // invoke-virtual {v1}, Landroid/text/TextPaint;->getTextLocale()Ljava/util/Locale;
/* aput-object v1, v0, v8 */
v1 = this.a;
/* .line 18 */
(( android.text.TextPaint ) v1 ).getTypeface ( ); // invoke-virtual {v1}, Landroid/text/TextPaint;->getTypeface()Landroid/graphics/Typeface;
/* aput-object v1, v0, v7 */
v1 = this.b;
/* aput-object v1, v0, v6 */
/* iget v1, p0, Lc/h/l/b;->c:I */
java.lang.Integer .valueOf ( v1 );
/* aput-object v1, v0, v5 */
/* iget v1, p0, Lc/h/l/b;->d:I */
java.lang.Integer .valueOf ( v1 );
/* aput-object v1, v0, v4 */
/* .line 19 */
v0 = c.h.m.c .a ( v0 );
} // :cond_3
/* new-array v0, v4, [Ljava/lang/Object; */
/* .line 20 */
v1 = this.a;
v1 = (( android.text.TextPaint ) v1 ).getTextSize ( ); // invoke-virtual {v1}, Landroid/text/TextPaint;->getTextSize()F
java.lang.Float .valueOf ( v1 );
/* aput-object v1, v0, v12 */
v1 = this.a;
v1 = (( android.text.TextPaint ) v1 ).getTextScaleX ( ); // invoke-virtual {v1}, Landroid/text/TextPaint;->getTextScaleX()F
java.lang.Float .valueOf ( v1 );
/* aput-object v1, v0, v11 */
v1 = this.a;
/* .line 21 */
v1 = (( android.text.TextPaint ) v1 ).getTextSkewX ( ); // invoke-virtual {v1}, Landroid/text/TextPaint;->getTextSkewX()F
java.lang.Float .valueOf ( v1 );
/* aput-object v1, v0, v10 */
v1 = this.a;
v1 = (( android.text.TextPaint ) v1 ).getFlags ( ); // invoke-virtual {v1}, Landroid/text/TextPaint;->getFlags()I
java.lang.Integer .valueOf ( v1 );
/* aput-object v1, v0, v9 */
v1 = this.a;
(( android.text.TextPaint ) v1 ).getTypeface ( ); // invoke-virtual {v1}, Landroid/text/TextPaint;->getTypeface()Landroid/graphics/Typeface;
/* aput-object v1, v0, v8 */
v1 = this.b;
/* aput-object v1, v0, v7 */
/* iget v1, p0, Lc/h/l/b;->c:I */
/* .line 22 */
java.lang.Integer .valueOf ( v1 );
/* aput-object v1, v0, v6 */
/* iget v1, p0, Lc/h/l/b;->d:I */
java.lang.Integer .valueOf ( v1 );
/* aput-object v1, v0, v5 */
/* .line 23 */
v0 = c.h.m.c .a ( v0 );
} // .end method
public java.lang.String toString ( ) {
/* .locals 4 */
/* .line 1 */
/* new-instance v0, Ljava/lang/StringBuilder; */
final String v1 = "{"; // const-string v1, "{"
/* invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
/* .line 2 */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "textSize="; // const-string v2, "textSize="
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v2 = this.a;
v2 = (( android.text.TextPaint ) v2 ).getTextSize ( ); // invoke-virtual {v2}, Landroid/text/TextPaint;->getTextSize()F
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 3 */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = ", textScaleX="; // const-string v2, ", textScaleX="
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v2 = this.a;
v2 = (( android.text.TextPaint ) v2 ).getTextScaleX ( ); // invoke-virtual {v2}, Landroid/text/TextPaint;->getTextScaleX()F
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 4 */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = ", textSkewX="; // const-string v2, ", textSkewX="
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v2 = this.a;
v2 = (( android.text.TextPaint ) v2 ).getTextSkewX ( ); // invoke-virtual {v2}, Landroid/text/TextPaint;->getTextSkewX()F
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 5 */
/* const/16 v2, 0x15 */
/* if-lt v1, v2, :cond_0 */
/* .line 6 */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = ", letterSpacing="; // const-string v2, ", letterSpacing="
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v2 = this.a;
v2 = (( android.text.TextPaint ) v2 ).getLetterSpacing ( ); // invoke-virtual {v2}, Landroid/text/TextPaint;->getLetterSpacing()F
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 7 */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = ", elegantTextHeight="; // const-string v2, ", elegantTextHeight="
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v2 = this.a;
v2 = (( android.text.TextPaint ) v2 ).isElegantTextHeight ( ); // invoke-virtual {v2}, Landroid/text/TextPaint;->isElegantTextHeight()Z
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 8 */
} // :cond_0
/* const/16 v2, 0x18 */
final String v3 = ", textLocale="; // const-string v3, ", textLocale="
/* if-lt v1, v2, :cond_1 */
/* .line 9 */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
(( java.lang.StringBuilder ) v1 ).append ( v3 ); // invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v2 = this.a;
(( android.text.TextPaint ) v2 ).getTextLocales ( ); // invoke-virtual {v2}, Landroid/text/TextPaint;->getTextLocales()Landroid/os/LocaleList;
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
} // :cond_1
/* const/16 v2, 0x11 */
/* if-lt v1, v2, :cond_2 */
/* .line 10 */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
(( java.lang.StringBuilder ) v1 ).append ( v3 ); // invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v2 = this.a;
(( android.text.TextPaint ) v2 ).getTextLocale ( ); // invoke-virtual {v2}, Landroid/text/TextPaint;->getTextLocale()Ljava/util/Locale;
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 11 */
} // :cond_2
} // :goto_0
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = ", typeface="; // const-string v2, ", typeface="
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v2 = this.a;
(( android.text.TextPaint ) v2 ).getTypeface ( ); // invoke-virtual {v2}, Landroid/text/TextPaint;->getTypeface()Landroid/graphics/Typeface;
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 12 */
/* const/16 v2, 0x1a */
/* if-lt v1, v2, :cond_3 */
/* .line 13 */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = ", variationSettings="; // const-string v2, ", variationSettings="
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v2 = this.a;
(( android.text.TextPaint ) v2 ).getFontVariationSettings ( ); // invoke-virtual {v2}, Landroid/text/TextPaint;->getFontVariationSettings()Ljava/lang/String;
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 14 */
} // :cond_3
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = ", textDir="; // const-string v2, ", textDir="
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v2 = this.b;
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 15 */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = ", breakStrategy="; // const-string v2, ", breakStrategy="
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* iget v2, p0, Lc/h/l/b;->c:I */
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 16 */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = ", hyphenationFrequency="; // const-string v2, ", hyphenationFrequency="
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* iget v2, p0, Lc/h/l/b;->d:I */
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v1 = "}"; // const-string v1, "}"
/* .line 17 */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 18 */
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // .end method
