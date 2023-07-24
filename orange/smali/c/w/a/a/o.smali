.class public Lc/w/a/a/o;
.super Lc/w/a/a/s;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lc/w/a/a/s;-><init>()V

    return-void
.end method

.method public constructor <init>(Lc/w/a/a/o;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lc/w/a/a/s;-><init>(Lc/w/a/a/s;)V

    return-void
.end method


# virtual methods
.method public a(Landroid/content/res/Resources;Landroid/util/AttributeSet;Landroid/content/res/Resources$Theme;Lorg/xmlpull/v1/XmlPullParser;)V
    .locals 1

    const-string v0, "pathData"

    .line 1
    invoke-static {p4, v0}, Lc/h/f/i/t;->a(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    sget-object v0, Lc/w/a/a/a;->d:[I

    invoke-static {p1, p3, p2, v0}, Lc/h/f/i/t;->a(Landroid/content/res/Resources;Landroid/content/res/Resources$Theme;Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    .line 3
    invoke-virtual {p0, p1, p4}, Lc/w/a/a/o;->a(Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;)V

    .line 4
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    return-void
.end method

.method public final a(Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;)V
    .locals 3

    const/4 v0, 0x0

    .line 5
    invoke-virtual {p1, v0}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 6
    iput-object v1, p0, Lc/w/a/a/s;->b:Ljava/lang/String;

    :cond_0
    const/4 v1, 0x1

    .line 7
    invoke-virtual {p1, v1}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 8
    invoke-static {v1}, Lc/h/g/e;->a(Ljava/lang/String;)[Lc/h/g/d;

    move-result-object v1

    iput-object v1, p0, Lc/w/a/a/s;->a:[Lc/h/g/d;

    :cond_1
    const/4 v1, 0x2

    const-string v2, "fillType"

    .line 9
    invoke-static {p1, p2, v2, v1, v0}, Lc/h/f/i/t;->b(Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;II)I

    move-result p1

    iput p1, p0, Lc/w/a/a/s;->c:I

    return-void
.end method

.method public b()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method
