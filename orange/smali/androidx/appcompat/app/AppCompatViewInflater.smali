.class public Landroidx/appcompat/app/AppCompatViewInflater;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final LOG_TAG:Ljava/lang/String; = "AppCompatViewInflater"

.field public static final sClassPrefixList:[Ljava/lang/String;

.field public static final sConstructorMap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/reflect/Constructor<",
            "+",
            "Landroid/view/View;",
            ">;>;"
        }
    .end annotation
.end field

.field public static final sConstructorSignature:[Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end field

.field public static final sOnClickAttrs:[I


# instance fields
.field public final mConstructorArgs:[Ljava/lang/Object;


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Class;

    .line 1
    const-class v1, Landroid/content/Context;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-class v1, Landroid/util/AttributeSet;

    const/4 v3, 0x1

    aput-object v1, v0, v3

    sput-object v0, Landroidx/appcompat/app/AppCompatViewInflater;->sConstructorSignature:[Ljava/lang/Class;

    new-array v0, v3, [I

    const v1, 0x101026f

    aput v1, v0, v2

    .line 2
    sput-object v0, Landroidx/appcompat/app/AppCompatViewInflater;->sOnClickAttrs:[I

    const-string v0, "android.widget."

    const-string v1, "android.view."

    const-string v2, "android.webkit."

    .line 3
    filled-new-array {v0, v1, v2}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, Landroidx/appcompat/app/AppCompatViewInflater;->sClassPrefixList:[Ljava/lang/String;

    .line 4
    new-instance v0, Lc/e/b;

    invoke-direct {v0}, Lc/e/b;-><init>()V

    sput-object v0, Landroidx/appcompat/app/AppCompatViewInflater;->sConstructorMap:Ljava/util/Map;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Object;

    .line 2
    iput-object v0, p0, Landroidx/appcompat/app/AppCompatViewInflater;->mConstructorArgs:[Ljava/lang/Object;

    return-void
.end method

.method public static a(Landroid/content/Context;Landroid/util/AttributeSet;ZZ)Landroid/content/Context;
    .locals 2

    .line 37
    sget-object v0, Lc/b/j;->View:[I

    const/4 v1, 0x0

    invoke-virtual {p0, p1, v0, v1, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p1

    if-eqz p2, :cond_0

    .line 38
    sget p2, Lc/b/j;->View_android_theme:I

    invoke-virtual {p1, p2, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result p2

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    if-eqz p3, :cond_1

    if-nez p2, :cond_1

    .line 39
    sget p2, Lc/b/j;->View_theme:I

    invoke-virtual {p1, p2, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result p2

    if-eqz p2, :cond_1

    const-string p3, "AppCompatViewInflater"

    const-string v0, "app:theme is now deprecated. Please move to using android:theme instead."

    .line 40
    invoke-static {p3, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 41
    :cond_1
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    if-eqz p2, :cond_3

    .line 42
    instance-of p1, p0, Lc/b/p/e;

    if-eqz p1, :cond_2

    move-object p1, p0

    check-cast p1, Lc/b/p/e;

    .line 43
    invoke-virtual {p1}, Lc/b/p/e;->b()I

    move-result p1

    if-eq p1, p2, :cond_3

    .line 44
    :cond_2
    new-instance p1, Lc/b/p/e;

    invoke-direct {p1, p0, p2}, Lc/b/p/e;-><init>(Landroid/content/Context;I)V

    move-object p0, p1

    :cond_3
    return-object p0
.end method


# virtual methods
.method public final a(Landroid/content/Context;Ljava/lang/String;Landroid/util/AttributeSet;)Landroid/view/View;
    .locals 4

    const-string v0, "view"

    .line 2
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    const-string p2, "class"

    .line 3
    invoke-interface {p3, v1, p2}, Landroid/util/AttributeSet;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    :cond_0
    const/4 v0, 0x1

    const/4 v2, 0x0

    .line 4
    :try_start_0
    iget-object v3, p0, Landroidx/appcompat/app/AppCompatViewInflater;->mConstructorArgs:[Ljava/lang/Object;

    aput-object p1, v3, v2

    .line 5
    iget-object v3, p0, Landroidx/appcompat/app/AppCompatViewInflater;->mConstructorArgs:[Ljava/lang/Object;

    aput-object p3, v3, v0

    const/4 p3, -0x1

    const/16 v3, 0x2e

    .line 6
    invoke-virtual {p2, v3}, Ljava/lang/String;->indexOf(I)I

    move-result v3

    if-ne p3, v3, :cond_3

    const/4 p3, 0x0

    .line 7
    :goto_0
    sget-object v3, Landroidx/appcompat/app/AppCompatViewInflater;->sClassPrefixList:[Ljava/lang/String;

    array-length v3, v3

    if-ge p3, v3, :cond_2

    .line 8
    sget-object v3, Landroidx/appcompat/app/AppCompatViewInflater;->sClassPrefixList:[Ljava/lang/String;

    aget-object v3, v3, p3

    invoke-virtual {p0, p1, p2, v3}, Landroidx/appcompat/app/AppCompatViewInflater;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Landroid/view/View;

    move-result-object v3
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v3, :cond_1

    .line 9
    iget-object p1, p0, Landroidx/appcompat/app/AppCompatViewInflater;->mConstructorArgs:[Ljava/lang/Object;

    aput-object v1, p1, v2

    .line 10
    aput-object v1, p1, v0

    return-object v3

    :cond_1
    add-int/lit8 p3, p3, 0x1

    goto :goto_0

    .line 11
    :cond_2
    iget-object p1, p0, Landroidx/appcompat/app/AppCompatViewInflater;->mConstructorArgs:[Ljava/lang/Object;

    aput-object v1, p1, v2

    .line 12
    aput-object v1, p1, v0

    return-object v1

    .line 13
    :cond_3
    :try_start_1
    invoke-virtual {p0, p1, p2, v1}, Landroidx/appcompat/app/AppCompatViewInflater;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Landroid/view/View;

    move-result-object p1
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 14
    iget-object p2, p0, Landroidx/appcompat/app/AppCompatViewInflater;->mConstructorArgs:[Ljava/lang/Object;

    aput-object v1, p2, v2

    .line 15
    aput-object v1, p2, v0

    return-object p1

    :catchall_0
    move-exception p1

    .line 16
    iget-object p2, p0, Landroidx/appcompat/app/AppCompatViewInflater;->mConstructorArgs:[Ljava/lang/Object;

    aput-object v1, p2, v2

    .line 17
    aput-object v1, p2, v0

    .line 18
    throw p1

    .line 19
    :catch_0
    iget-object p1, p0, Landroidx/appcompat/app/AppCompatViewInflater;->mConstructorArgs:[Ljava/lang/Object;

    aput-object v1, p1, v2

    .line 20
    aput-object v1, p1, v0

    return-object v1
.end method

.method public final a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Landroid/view/View;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/ClassNotFoundException;,
            Landroid/view/InflateException;
        }
    .end annotation

    .line 28
    sget-object v0, Landroidx/appcompat/app/AppCompatViewInflater;->sConstructorMap:Ljava/util/Map;

    invoke-interface {v0, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/reflect/Constructor;

    if-nez v0, :cond_1

    if-eqz p3, :cond_0

    .line 29
    :try_start_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    goto :goto_0

    :cond_0
    move-object p3, p2

    :goto_0
    const/4 v0, 0x0

    .line 30
    invoke-virtual {p1}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object p1

    .line 31
    invoke-static {p3, v0, p1}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    move-result-object p1

    const-class p3, Landroid/view/View;

    .line 32
    invoke-virtual {p1, p3}, Ljava/lang/Class;->asSubclass(Ljava/lang/Class;)Ljava/lang/Class;

    move-result-object p1

    .line 33
    sget-object p3, Landroidx/appcompat/app/AppCompatViewInflater;->sConstructorSignature:[Ljava/lang/Class;

    invoke-virtual {p1, p3}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v0

    .line 34
    sget-object p1, Landroidx/appcompat/app/AppCompatViewInflater;->sConstructorMap:Ljava/util/Map;

    invoke-interface {p1, p2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    const/4 p1, 0x1

    .line 35
    invoke-virtual {v0, p1}, Ljava/lang/reflect/Constructor;->setAccessible(Z)V

    .line 36
    iget-object p1, p0, Landroidx/appcompat/app/AppCompatViewInflater;->mConstructorArgs:[Ljava/lang/Object;

    invoke-virtual {v0, p1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/view/View;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public final a(Landroid/view/View;Landroid/util/AttributeSet;)V
    .locals 3

    .line 21
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    .line 22
    instance-of v1, v0, Landroid/content/ContextWrapper;

    if-eqz v1, :cond_2

    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0xf

    if-lt v1, v2, :cond_0

    .line 23
    invoke-static {p1}, Lc/h/n/v0;->y(Landroid/view/View;)Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    .line 24
    :cond_0
    sget-object v1, Landroidx/appcompat/app/AppCompatViewInflater;->sOnClickAttrs:[I

    invoke-virtual {v0, p2, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p2

    const/4 v0, 0x0

    .line 25
    invoke-virtual {p2, v0}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 26
    new-instance v1, Lc/b/k/q0;

    invoke-direct {v1, p1, v0}, Lc/b/k/q0;-><init>(Landroid/view/View;Ljava/lang/String;)V

    invoke-virtual {p1, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 27
    :cond_1
    invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V

    :cond_2
    :goto_0
    return-void
.end method

.method public final a(Landroid/view/View;Ljava/lang/String;)V
    .locals 2

    if-eqz p1, :cond_0

    return-void

    .line 1
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " asked to inflate view for <"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, ">, but returned null"

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public createAutoCompleteTextView(Landroid/content/Context;Landroid/util/AttributeSet;)Lc/b/q/l;
    .locals 1

    .line 1
    new-instance v0, Lc/b/q/l;

    invoke-direct {v0, p1, p2}, Lc/b/q/l;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-object v0
.end method

.method public createButton(Landroid/content/Context;Landroid/util/AttributeSet;)Lc/b/q/n;
    .locals 1

    .line 1
    new-instance v0, Lc/b/q/n;

    invoke-direct {v0, p1, p2}, Lc/b/q/n;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-object v0
.end method

.method public createCheckBox(Landroid/content/Context;Landroid/util/AttributeSet;)Lc/b/q/o;
    .locals 1

    .line 1
    new-instance v0, Lc/b/q/o;

    invoke-direct {v0, p1, p2}, Lc/b/q/o;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-object v0
.end method

.method public createCheckedTextView(Landroid/content/Context;Landroid/util/AttributeSet;)Lc/b/q/p;
    .locals 1

    .line 1
    new-instance v0, Lc/b/q/p;

    invoke-direct {v0, p1, p2}, Lc/b/q/p;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-object v0
.end method

.method public createEditText(Landroid/content/Context;Landroid/util/AttributeSet;)Lc/b/q/t;
    .locals 1

    .line 1
    new-instance v0, Lc/b/q/t;

    invoke-direct {v0, p1, p2}, Lc/b/q/t;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-object v0
.end method

.method public createImageButton(Landroid/content/Context;Landroid/util/AttributeSet;)Lc/b/q/v;
    .locals 1

    .line 1
    new-instance v0, Lc/b/q/v;

    invoke-direct {v0, p1, p2}, Lc/b/q/v;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-object v0
.end method

.method public createImageView(Landroid/content/Context;Landroid/util/AttributeSet;)Lc/b/q/x;
    .locals 1

    .line 1
    new-instance v0, Lc/b/q/x;

    invoke-direct {v0, p1, p2}, Lc/b/q/x;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-object v0
.end method

.method public createMultiAutoCompleteTextView(Landroid/content/Context;Landroid/util/AttributeSet;)Lc/b/q/y;
    .locals 1

    .line 1
    new-instance v0, Lc/b/q/y;

    invoke-direct {v0, p1, p2}, Lc/b/q/y;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-object v0
.end method

.method public createRadioButton(Landroid/content/Context;Landroid/util/AttributeSet;)Lc/b/q/b0;
    .locals 1

    .line 1
    new-instance v0, Lc/b/q/b0;

    invoke-direct {v0, p1, p2}, Lc/b/q/b0;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-object v0
.end method

.method public createRatingBar(Landroid/content/Context;Landroid/util/AttributeSet;)Lc/b/q/c0;
    .locals 1

    .line 1
    new-instance v0, Lc/b/q/c0;

    invoke-direct {v0, p1, p2}, Lc/b/q/c0;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-object v0
.end method

.method public createSeekBar(Landroid/content/Context;Landroid/util/AttributeSet;)Lc/b/q/d0;
    .locals 1

    .line 1
    new-instance v0, Lc/b/q/d0;

    invoke-direct {v0, p1, p2}, Lc/b/q/d0;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-object v0
.end method

.method public createSpinner(Landroid/content/Context;Landroid/util/AttributeSet;)Lc/b/q/q0;
    .locals 1

    .line 1
    new-instance v0, Lc/b/q/q0;

    invoke-direct {v0, p1, p2}, Lc/b/q/q0;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-object v0
.end method

.method public createTextView(Landroid/content/Context;Landroid/util/AttributeSet;)Lc/b/q/v0;
    .locals 1

    .line 1
    new-instance v0, Lc/b/q/v0;

    invoke-direct {v0, p1, p2}, Lc/b/q/v0;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-object v0
.end method

.method public createToggleButton(Landroid/content/Context;Landroid/util/AttributeSet;)Lc/b/q/x0;
    .locals 1

    .line 1
    new-instance v0, Lc/b/q/x0;

    invoke-direct {v0, p1, p2}, Lc/b/q/x0;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-object v0
.end method

.method public createView(Landroid/content/Context;Ljava/lang/String;Landroid/util/AttributeSet;)Landroid/view/View;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public final createView(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;ZZZZ)Landroid/view/View;
    .locals 0

    if-eqz p5, :cond_0

    if-eqz p1, :cond_0

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    goto :goto_0

    :cond_0
    move-object p1, p3

    :goto_0
    if-nez p6, :cond_1

    if-eqz p7, :cond_2

    .line 2
    :cond_1
    invoke-static {p1, p4, p6, p7}, Landroidx/appcompat/app/AppCompatViewInflater;->a(Landroid/content/Context;Landroid/util/AttributeSet;ZZ)Landroid/content/Context;

    move-result-object p1

    :cond_2
    if-eqz p8, :cond_3

    .line 3
    invoke-static {p1}, Lc/b/q/h2;->b(Landroid/content/Context;)Landroid/content/Context;

    move-result-object p1

    :cond_3
    const/4 p5, -0x1

    .line 4
    invoke-virtual {p2}, Ljava/lang/String;->hashCode()I

    move-result p6

    sparse-switch p6, :sswitch_data_0

    goto/16 :goto_1

    :sswitch_0
    const-string p6, "Button"

    invoke-virtual {p2, p6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p6

    if-eqz p6, :cond_4

    const/4 p5, 0x2

    goto/16 :goto_1

    :sswitch_1
    const-string p6, "EditText"

    invoke-virtual {p2, p6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p6

    if-eqz p6, :cond_4

    const/4 p5, 0x3

    goto/16 :goto_1

    :sswitch_2
    const-string p6, "CheckBox"

    invoke-virtual {p2, p6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p6

    if-eqz p6, :cond_4

    const/4 p5, 0x6

    goto/16 :goto_1

    :sswitch_3
    const-string p6, "AutoCompleteTextView"

    invoke-virtual {p2, p6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p6

    if-eqz p6, :cond_4

    const/16 p5, 0x9

    goto/16 :goto_1

    :sswitch_4
    const-string p6, "ImageView"

    invoke-virtual {p2, p6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p6

    if-eqz p6, :cond_4

    const/4 p5, 0x1

    goto :goto_1

    :sswitch_5
    const-string p6, "ToggleButton"

    invoke-virtual {p2, p6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p6

    if-eqz p6, :cond_4

    const/16 p5, 0xd

    goto :goto_1

    :sswitch_6
    const-string p6, "RadioButton"

    invoke-virtual {p2, p6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p6

    if-eqz p6, :cond_4

    const/4 p5, 0x7

    goto :goto_1

    :sswitch_7
    const-string p6, "Spinner"

    invoke-virtual {p2, p6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p6

    if-eqz p6, :cond_4

    const/4 p5, 0x4

    goto :goto_1

    :sswitch_8
    const-string p6, "SeekBar"

    invoke-virtual {p2, p6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p6

    if-eqz p6, :cond_4

    const/16 p5, 0xc

    goto :goto_1

    :sswitch_9
    const-string p6, "ImageButton"

    invoke-virtual {p2, p6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p6

    if-eqz p6, :cond_4

    const/4 p5, 0x5

    goto :goto_1

    :sswitch_a
    const-string p6, "TextView"

    invoke-virtual {p2, p6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p6

    if-eqz p6, :cond_4

    const/4 p5, 0x0

    goto :goto_1

    :sswitch_b
    const-string p6, "MultiAutoCompleteTextView"

    invoke-virtual {p2, p6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p6

    if-eqz p6, :cond_4

    const/16 p5, 0xa

    goto :goto_1

    :sswitch_c
    const-string p6, "CheckedTextView"

    invoke-virtual {p2, p6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p6

    if-eqz p6, :cond_4

    const/16 p5, 0x8

    goto :goto_1

    :sswitch_d
    const-string p6, "RatingBar"

    invoke-virtual {p2, p6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p6

    if-eqz p6, :cond_4

    const/16 p5, 0xb

    :cond_4
    :goto_1
    packed-switch p5, :pswitch_data_0

    .line 5
    invoke-virtual {p0, p1, p2, p4}, Landroidx/appcompat/app/AppCompatViewInflater;->createView(Landroid/content/Context;Ljava/lang/String;Landroid/util/AttributeSet;)Landroid/view/View;

    move-result-object p5

    goto/16 :goto_2

    .line 6
    :pswitch_0
    invoke-virtual {p0, p1, p4}, Landroidx/appcompat/app/AppCompatViewInflater;->createToggleButton(Landroid/content/Context;Landroid/util/AttributeSet;)Lc/b/q/x0;

    move-result-object p5

    .line 7
    invoke-virtual {p0, p5, p2}, Landroidx/appcompat/app/AppCompatViewInflater;->a(Landroid/view/View;Ljava/lang/String;)V

    goto/16 :goto_2

    .line 8
    :pswitch_1
    invoke-virtual {p0, p1, p4}, Landroidx/appcompat/app/AppCompatViewInflater;->createSeekBar(Landroid/content/Context;Landroid/util/AttributeSet;)Lc/b/q/d0;

    move-result-object p5

    .line 9
    invoke-virtual {p0, p5, p2}, Landroidx/appcompat/app/AppCompatViewInflater;->a(Landroid/view/View;Ljava/lang/String;)V

    goto :goto_2

    .line 10
    :pswitch_2
    invoke-virtual {p0, p1, p4}, Landroidx/appcompat/app/AppCompatViewInflater;->createRatingBar(Landroid/content/Context;Landroid/util/AttributeSet;)Lc/b/q/c0;

    move-result-object p5

    .line 11
    invoke-virtual {p0, p5, p2}, Landroidx/appcompat/app/AppCompatViewInflater;->a(Landroid/view/View;Ljava/lang/String;)V

    goto :goto_2

    .line 12
    :pswitch_3
    invoke-virtual {p0, p1, p4}, Landroidx/appcompat/app/AppCompatViewInflater;->createMultiAutoCompleteTextView(Landroid/content/Context;Landroid/util/AttributeSet;)Lc/b/q/y;

    move-result-object p5

    .line 13
    invoke-virtual {p0, p5, p2}, Landroidx/appcompat/app/AppCompatViewInflater;->a(Landroid/view/View;Ljava/lang/String;)V

    goto :goto_2

    .line 14
    :pswitch_4
    invoke-virtual {p0, p1, p4}, Landroidx/appcompat/app/AppCompatViewInflater;->createAutoCompleteTextView(Landroid/content/Context;Landroid/util/AttributeSet;)Lc/b/q/l;

    move-result-object p5

    .line 15
    invoke-virtual {p0, p5, p2}, Landroidx/appcompat/app/AppCompatViewInflater;->a(Landroid/view/View;Ljava/lang/String;)V

    goto :goto_2

    .line 16
    :pswitch_5
    invoke-virtual {p0, p1, p4}, Landroidx/appcompat/app/AppCompatViewInflater;->createCheckedTextView(Landroid/content/Context;Landroid/util/AttributeSet;)Lc/b/q/p;

    move-result-object p5

    .line 17
    invoke-virtual {p0, p5, p2}, Landroidx/appcompat/app/AppCompatViewInflater;->a(Landroid/view/View;Ljava/lang/String;)V

    goto :goto_2

    .line 18
    :pswitch_6
    invoke-virtual {p0, p1, p4}, Landroidx/appcompat/app/AppCompatViewInflater;->createRadioButton(Landroid/content/Context;Landroid/util/AttributeSet;)Lc/b/q/b0;

    move-result-object p5

    .line 19
    invoke-virtual {p0, p5, p2}, Landroidx/appcompat/app/AppCompatViewInflater;->a(Landroid/view/View;Ljava/lang/String;)V

    goto :goto_2

    .line 20
    :pswitch_7
    invoke-virtual {p0, p1, p4}, Landroidx/appcompat/app/AppCompatViewInflater;->createCheckBox(Landroid/content/Context;Landroid/util/AttributeSet;)Lc/b/q/o;

    move-result-object p5

    .line 21
    invoke-virtual {p0, p5, p2}, Landroidx/appcompat/app/AppCompatViewInflater;->a(Landroid/view/View;Ljava/lang/String;)V

    goto :goto_2

    .line 22
    :pswitch_8
    invoke-virtual {p0, p1, p4}, Landroidx/appcompat/app/AppCompatViewInflater;->createImageButton(Landroid/content/Context;Landroid/util/AttributeSet;)Lc/b/q/v;

    move-result-object p5

    .line 23
    invoke-virtual {p0, p5, p2}, Landroidx/appcompat/app/AppCompatViewInflater;->a(Landroid/view/View;Ljava/lang/String;)V

    goto :goto_2

    .line 24
    :pswitch_9
    invoke-virtual {p0, p1, p4}, Landroidx/appcompat/app/AppCompatViewInflater;->createSpinner(Landroid/content/Context;Landroid/util/AttributeSet;)Lc/b/q/q0;

    move-result-object p5

    .line 25
    invoke-virtual {p0, p5, p2}, Landroidx/appcompat/app/AppCompatViewInflater;->a(Landroid/view/View;Ljava/lang/String;)V

    goto :goto_2

    .line 26
    :pswitch_a
    invoke-virtual {p0, p1, p4}, Landroidx/appcompat/app/AppCompatViewInflater;->createEditText(Landroid/content/Context;Landroid/util/AttributeSet;)Lc/b/q/t;

    move-result-object p5

    .line 27
    invoke-virtual {p0, p5, p2}, Landroidx/appcompat/app/AppCompatViewInflater;->a(Landroid/view/View;Ljava/lang/String;)V

    goto :goto_2

    .line 28
    :pswitch_b
    invoke-virtual {p0, p1, p4}, Landroidx/appcompat/app/AppCompatViewInflater;->createButton(Landroid/content/Context;Landroid/util/AttributeSet;)Lc/b/q/n;

    move-result-object p5

    .line 29
    invoke-virtual {p0, p5, p2}, Landroidx/appcompat/app/AppCompatViewInflater;->a(Landroid/view/View;Ljava/lang/String;)V

    goto :goto_2

    .line 30
    :pswitch_c
    invoke-virtual {p0, p1, p4}, Landroidx/appcompat/app/AppCompatViewInflater;->createImageView(Landroid/content/Context;Landroid/util/AttributeSet;)Lc/b/q/x;

    move-result-object p5

    .line 31
    invoke-virtual {p0, p5, p2}, Landroidx/appcompat/app/AppCompatViewInflater;->a(Landroid/view/View;Ljava/lang/String;)V

    goto :goto_2

    .line 32
    :pswitch_d
    invoke-virtual {p0, p1, p4}, Landroidx/appcompat/app/AppCompatViewInflater;->createTextView(Landroid/content/Context;Landroid/util/AttributeSet;)Lc/b/q/v0;

    move-result-object p5

    .line 33
    invoke-virtual {p0, p5, p2}, Landroidx/appcompat/app/AppCompatViewInflater;->a(Landroid/view/View;Ljava/lang/String;)V

    :goto_2
    if-nez p5, :cond_5

    if-eq p3, p1, :cond_5

    .line 34
    invoke-virtual {p0, p1, p2, p4}, Landroidx/appcompat/app/AppCompatViewInflater;->a(Landroid/content/Context;Ljava/lang/String;Landroid/util/AttributeSet;)Landroid/view/View;

    move-result-object p5

    :cond_5
    if-eqz p5, :cond_6

    .line 35
    invoke-virtual {p0, p5, p4}, Landroidx/appcompat/app/AppCompatViewInflater;->a(Landroid/view/View;Landroid/util/AttributeSet;)V

    :cond_6
    return-object p5

    :sswitch_data_0
    .sparse-switch
        -0x7404ceea -> :sswitch_d
        -0x56c015e7 -> :sswitch_c
        -0x503aa7ad -> :sswitch_b
        -0x37f7066e -> :sswitch_a
        -0x37e04bb3 -> :sswitch_9
        -0x274065a5 -> :sswitch_8
        -0x1440b607 -> :sswitch_7
        0x2e46a6ed -> :sswitch_6
        0x2fa453c6 -> :sswitch_5
        0x431b5280 -> :sswitch_4
        0x5445f9ba -> :sswitch_3
        0x5f7507c3 -> :sswitch_2
        0x63577677 -> :sswitch_1
        0x77471352 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
