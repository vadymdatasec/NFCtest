.class public Lc/b/k/n0;
.super Lc/b/k/t;
.source "SourceFile"

# interfaces
.implements Lc/b/p/o/m$a;
.implements Landroid/view/LayoutInflater$Factory2;


# static fields
.field public static final b0:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public static final c0:Z

.field public static final d0:[I

.field public static e0:Z

.field public static final f0:Z


# instance fields
.field public A:Z

.field public B:Z

.field public C:Z

.field public D:Z

.field public E:Z

.field public F:Z

.field public G:Z

.field public H:[Lc/b/k/l0;

.field public I:Lc/b/k/l0;

.field public J:Z

.field public K:Z

.field public L:Z

.field public M:Z

.field public N:Z

.field public O:I

.field public P:I

.field public Q:Z

.field public R:Z

.field public S:Lc/b/k/i0;

.field public T:Lc/b/k/i0;

.field public U:Z

.field public V:I

.field public final W:Ljava/lang/Runnable;

.field public X:Z

.field public Y:Landroid/graphics/Rect;

.field public Z:Landroid/graphics/Rect;

.field public a0:Landroidx/appcompat/app/AppCompatViewInflater;

.field public final e:Ljava/lang/Object;

.field public final f:Landroid/content/Context;

.field public g:Landroid/view/Window;

.field public h:Lc/b/k/f0;

.field public final i:Lc/b/k/s;

.field public j:Lc/b/k/a;

.field public k:Landroid/view/MenuInflater;

.field public l:Ljava/lang/CharSequence;

.field public m:Lc/b/q/y0;

.field public n:Lc/b/k/c0;

.field public o:Lc/b/k/m0;

.field public p:Lc/b/p/c;

.field public q:Landroidx/appcompat/widget/ActionBarContextView;

.field public r:Landroid/widget/PopupWindow;

.field public s:Ljava/lang/Runnable;

.field public t:Lc/h/n/c1;

.field public u:Z

.field public v:Z

.field public w:Landroid/view/ViewGroup;

.field public x:Landroid/widget/TextView;

.field public y:Landroid/view/View;

.field public z:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, Lc/e/b;

    invoke-direct {v0}, Lc/e/b;-><init>()V

    sput-object v0, Lc/b/k/n0;->b0:Ljava/util/Map;

    .line 2
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x15

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-ge v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    sput-boolean v0, Lc/b/k/n0;->c0:Z

    new-array v0, v3, [I

    const v4, 0x1010054

    aput v4, v0, v2

    .line 3
    sput-object v0, Lc/b/k/n0;->d0:[I

    .line 4
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt v0, v1, :cond_1

    const/16 v1, 0x19

    if-gt v0, v1, :cond_1

    const/4 v2, 0x1

    :cond_1
    sput-boolean v2, Lc/b/k/n0;->f0:Z

    .line 5
    sget-boolean v0, Lc/b/k/n0;->c0:Z

    if-eqz v0, :cond_2

    sget-boolean v0, Lc/b/k/n0;->e0:Z

    if-nez v0, :cond_2

    .line 6
    invoke-static {}, Ljava/lang/Thread;->getDefaultUncaughtExceptionHandler()Ljava/lang/Thread$UncaughtExceptionHandler;

    move-result-object v0

    .line 7
    new-instance v1, Lc/b/k/u;

    invoke-direct {v1, v0}, Lc/b/k/u;-><init>(Ljava/lang/Thread$UncaughtExceptionHandler;)V

    invoke-static {v1}, Ljava/lang/Thread;->setDefaultUncaughtExceptionHandler(Ljava/lang/Thread$UncaughtExceptionHandler;)V

    .line 8
    sput-boolean v3, Lc/b/k/n0;->e0:Z

    :cond_2
    return-void
.end method

.method public constructor <init>(Landroid/app/Activity;Lc/b/k/s;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, v0, p2, p1}, Lc/b/k/n0;-><init>(Landroid/content/Context;Landroid/view/Window;Lc/b/k/s;Ljava/lang/Object;)V

    return-void
.end method

.method public constructor <init>(Landroid/app/Dialog;Lc/b/k/s;)V
    .locals 2

    .line 2
    invoke-virtual {p1}, Landroid/app/Dialog;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {p1}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v1

    invoke-direct {p0, v0, v1, p2, p1}, Lc/b/k/n0;-><init>(Landroid/content/Context;Landroid/view/Window;Lc/b/k/s;Ljava/lang/Object;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/view/Window;Lc/b/k/s;Ljava/lang/Object;)V
    .locals 2

    .line 3
    invoke-direct {p0}, Lc/b/k/t;-><init>()V

    const/4 v0, 0x0

    .line 4
    iput-object v0, p0, Lc/b/k/n0;->t:Lc/h/n/c1;

    const/4 v0, 0x1

    .line 5
    iput-boolean v0, p0, Lc/b/k/n0;->u:Z

    const/16 v0, -0x64

    .line 6
    iput v0, p0, Lc/b/k/n0;->O:I

    .line 7
    new-instance v1, Lc/b/k/v;

    invoke-direct {v1, p0}, Lc/b/k/v;-><init>(Lc/b/k/n0;)V

    iput-object v1, p0, Lc/b/k/n0;->W:Ljava/lang/Runnable;

    .line 8
    iput-object p1, p0, Lc/b/k/n0;->f:Landroid/content/Context;

    .line 9
    iput-object p3, p0, Lc/b/k/n0;->i:Lc/b/k/s;

    .line 10
    iput-object p4, p0, Lc/b/k/n0;->e:Ljava/lang/Object;

    .line 11
    iget p1, p0, Lc/b/k/n0;->O:I

    if-ne p1, v0, :cond_0

    instance-of p1, p4, Landroid/app/Dialog;

    if-eqz p1, :cond_0

    .line 12
    invoke-virtual {p0}, Lc/b/k/n0;->F()Lc/b/k/r;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 13
    invoke-virtual {p1}, Lc/b/k/r;->o()Lc/b/k/t;

    move-result-object p1

    invoke-virtual {p1}, Lc/b/k/t;->a()I

    move-result p1

    iput p1, p0, Lc/b/k/n0;->O:I

    .line 14
    :cond_0
    iget p1, p0, Lc/b/k/n0;->O:I

    if-ne p1, v0, :cond_1

    .line 15
    sget-object p1, Lc/b/k/n0;->b0:Ljava/util/Map;

    iget-object p3, p0, Lc/b/k/n0;->e:Ljava/lang/Object;

    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p3

    invoke-interface {p1, p3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    if-eqz p1, :cond_1

    .line 16
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    iput p1, p0, Lc/b/k/n0;->O:I

    .line 17
    sget-object p1, Lc/b/k/n0;->b0:Ljava/util/Map;

    iget-object p3, p0, Lc/b/k/n0;->e:Ljava/lang/Object;

    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p3

    invoke-interface {p1, p3}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    if-eqz p2, :cond_2

    .line 18
    invoke-virtual {p0, p2}, Lc/b/k/n0;->a(Landroid/view/Window;)V

    .line 19
    :cond_2
    invoke-static {}, Lc/b/q/s;->c()V

    return-void
.end method


# virtual methods
.method public A()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lc/b/k/n0;->u:Z

    return v0
.end method

.method public B()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lc/b/k/n0;->p:Lc/b/p/c;

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Lc/b/p/c;->a()V

    return v1

    .line 3
    :cond_0
    invoke-virtual {p0}, Lc/b/k/n0;->c()Lc/b/k/a;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 4
    invoke-virtual {v0}, Lc/b/k/a;->f()Z

    move-result v0

    if-eqz v0, :cond_1

    return v1

    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public final C()Lc/b/k/a;
    .locals 1

    .line 1
    iget-object v0, p0, Lc/b/k/n0;->j:Lc/b/k/a;

    return-object v0
.end method

.method public final D()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lc/b/k/n0;->v:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lc/b/k/n0;->w:Landroid/view/ViewGroup;

    if-eqz v0, :cond_0

    invoke-static {v0}, Lc/h/n/v0;->D(Landroid/view/View;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final E()V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lc/b/k/n0;->v:Z

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    new-instance v0, Landroid/util/AndroidRuntimeException;

    const-string v1, "Window feature must be requested before adding content"

    invoke-direct {v0, v1}, Landroid/util/AndroidRuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final F()Lc/b/k/r;
    .locals 3

    .line 1
    iget-object v0, p0, Lc/b/k/n0;->f:Landroid/content/Context;

    :goto_0
    const/4 v1, 0x0

    if-eqz v0, :cond_1

    .line 2
    instance-of v2, v0, Lc/b/k/r;

    if-eqz v2, :cond_0

    .line 3
    check-cast v0, Lc/b/k/r;

    return-object v0

    .line 4
    :cond_0
    instance-of v2, v0, Landroid/content/ContextWrapper;

    if-eqz v2, :cond_1

    .line 5
    check-cast v0, Landroid/content/ContextWrapper;

    invoke-virtual {v0}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    move-result-object v0

    goto :goto_0

    :cond_1
    return-object v1
.end method

.method public a()I
    .locals 1

    .line 216
    iget v0, p0, Lc/b/k/n0;->O:I

    return v0
.end method

.method public a(I)Landroid/view/View;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Landroid/view/View;",
            ">(I)TT;"
        }
    .end annotation

    .line 24
    invoke-virtual {p0}, Lc/b/k/n0;->r()V

    .line 25
    iget-object v0, p0, Lc/b/k/n0;->g:Landroid/view/Window;

    invoke-virtual {v0, p1}, Landroid/view/Window;->findViewById(I)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public a(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;
    .locals 11

    .line 85
    iget-object v0, p0, Lc/b/k/n0;->a0:Landroidx/appcompat/app/AppCompatViewInflater;

    const/4 v1, 0x0

    if-nez v0, :cond_2

    .line 86
    iget-object v0, p0, Lc/b/k/n0;->f:Landroid/content/Context;

    sget-object v2, Lc/b/j;->AppCompatTheme:[I

    invoke-virtual {v0, v2}, Landroid/content/Context;->obtainStyledAttributes([I)Landroid/content/res/TypedArray;

    move-result-object v0

    .line 87
    sget v2, Lc/b/j;->AppCompatTheme_viewInflaterClass:I

    .line 88
    invoke-virtual {v0, v2}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 89
    const-class v2, Landroidx/appcompat/app/AppCompatViewInflater;

    .line 90
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    .line 91
    :cond_0
    :try_start_0
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v2

    new-array v3, v1, [Ljava/lang/Class;

    .line 92
    invoke-virtual {v2, v3}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v2

    new-array v3, v1, [Ljava/lang/Object;

    .line 93
    invoke-virtual {v2, v3}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/appcompat/app/AppCompatViewInflater;

    iput-object v2, p0, Lc/b/k/n0;->a0:Landroidx/appcompat/app/AppCompatViewInflater;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v2

    .line 94
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Failed to instantiate custom view inflater "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ". Falling back to default."

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v3, "AppCompatDelegate"

    invoke-static {v3, v0, v2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 95
    new-instance v0, Landroidx/appcompat/app/AppCompatViewInflater;

    invoke-direct {v0}, Landroidx/appcompat/app/AppCompatViewInflater;-><init>()V

    iput-object v0, p0, Lc/b/k/n0;->a0:Landroidx/appcompat/app/AppCompatViewInflater;

    goto :goto_1

    .line 96
    :cond_1
    :goto_0
    new-instance v0, Landroidx/appcompat/app/AppCompatViewInflater;

    invoke-direct {v0}, Landroidx/appcompat/app/AppCompatViewInflater;-><init>()V

    iput-object v0, p0, Lc/b/k/n0;->a0:Landroidx/appcompat/app/AppCompatViewInflater;

    .line 97
    :cond_2
    :goto_1
    sget-boolean v0, Lc/b/k/n0;->c0:Z

    if-eqz v0, :cond_5

    .line 98
    instance-of v0, p4, Lorg/xmlpull/v1/XmlPullParser;

    const/4 v2, 0x1

    if-eqz v0, :cond_3

    move-object v0, p4

    check-cast v0, Lorg/xmlpull/v1/XmlPullParser;

    .line 99
    invoke-interface {v0}, Lorg/xmlpull/v1/XmlPullParser;->getDepth()I

    move-result v0

    if-le v0, v2, :cond_4

    const/4 v1, 0x1

    goto :goto_2

    :cond_3
    move-object v0, p1

    check-cast v0, Landroid/view/ViewParent;

    .line 100
    invoke-virtual {p0, v0}, Lc/b/k/n0;->a(Landroid/view/ViewParent;)Z

    move-result v0

    move v1, v0

    :cond_4
    :goto_2
    move v7, v1

    goto :goto_3

    :cond_5
    const/4 v7, 0x0

    .line 101
    :goto_3
    iget-object v2, p0, Lc/b/k/n0;->a0:Landroidx/appcompat/app/AppCompatViewInflater;

    sget-boolean v8, Lc/b/k/n0;->c0:Z

    const/4 v9, 0x1

    .line 102
    invoke-static {}, Lc/b/q/u2;->b()Z

    move-result v10

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    move-object v6, p4

    .line 103
    invoke-virtual/range {v2 .. v10}, Landroidx/appcompat/app/AppCompatViewInflater;->createView(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;ZZZZ)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public a(IZ)Lc/b/k/l0;
    .locals 3

    .line 195
    iget-object p2, p0, Lc/b/k/n0;->H:[Lc/b/k/l0;

    if-eqz p2, :cond_0

    array-length v0, p2

    if-gt v0, p1, :cond_2

    :cond_0
    add-int/lit8 v0, p1, 0x1

    .line 196
    new-array v0, v0, [Lc/b/k/l0;

    if-eqz p2, :cond_1

    .line 197
    array-length v1, p2

    const/4 v2, 0x0

    invoke-static {p2, v2, v0, v2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 198
    :cond_1
    iput-object v0, p0, Lc/b/k/n0;->H:[Lc/b/k/l0;

    move-object p2, v0

    .line 199
    :cond_2
    aget-object v0, p2, p1

    if-nez v0, :cond_3

    .line 200
    new-instance v0, Lc/b/k/l0;

    invoke-direct {v0, p1}, Lc/b/k/l0;-><init>(I)V

    aput-object v0, p2, p1

    :cond_3
    return-object v0
.end method

.method public a(Landroid/view/Menu;)Lc/b/k/l0;
    .locals 5

    .line 191
    iget-object v0, p0, Lc/b/k/n0;->H:[Lc/b/k/l0;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 192
    array-length v2, v0

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    if-ge v1, v2, :cond_2

    .line 193
    aget-object v3, v0, v1

    if-eqz v3, :cond_1

    .line 194
    iget-object v4, v3, Lc/b/k/l0;->j:Lc/b/p/o/m;

    if-ne v4, p1, :cond_1

    return-object v3

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    const/4 p1, 0x0

    return-object p1
.end method

.method public a(Lc/b/p/b;)Lc/b/p/c;
    .locals 2

    if-eqz p1, :cond_3

    .line 64
    iget-object v0, p0, Lc/b/k/n0;->p:Lc/b/p/c;

    if-eqz v0, :cond_0

    .line 65
    invoke-virtual {v0}, Lc/b/p/c;->a()V

    .line 66
    :cond_0
    new-instance v0, Lc/b/k/e0;

    invoke-direct {v0, p0, p1}, Lc/b/k/e0;-><init>(Lc/b/k/n0;Lc/b/p/b;)V

    .line 67
    invoke-virtual {p0}, Lc/b/k/n0;->c()Lc/b/k/a;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 68
    invoke-virtual {p1, v0}, Lc/b/k/a;->a(Lc/b/p/b;)Lc/b/p/c;

    move-result-object p1

    iput-object p1, p0, Lc/b/k/n0;->p:Lc/b/p/c;

    if-eqz p1, :cond_1

    .line 69
    iget-object v1, p0, Lc/b/k/n0;->i:Lc/b/k/s;

    if-eqz v1, :cond_1

    .line 70
    invoke-interface {v1, p1}, Lc/b/k/s;->a(Lc/b/p/c;)V

    .line 71
    :cond_1
    iget-object p1, p0, Lc/b/k/n0;->p:Lc/b/p/c;

    if-nez p1, :cond_2

    .line 72
    invoke-virtual {p0, v0}, Lc/b/k/n0;->b(Lc/b/p/b;)Lc/b/p/c;

    move-result-object p1

    iput-object p1, p0, Lc/b/k/n0;->p:Lc/b/p/c;

    .line 73
    :cond_2
    iget-object p1, p0, Lc/b/k/n0;->p:Lc/b/p/c;

    return-object p1

    .line 74
    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "ActionMode callback can not be null."

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public a(ILc/b/k/l0;Landroid/view/Menu;)V
    .locals 2

    if-nez p3, :cond_1

    if-nez p2, :cond_0

    if-ltz p1, :cond_0

    .line 185
    iget-object v0, p0, Lc/b/k/n0;->H:[Lc/b/k/l0;

    array-length v1, v0

    if-ge p1, v1, :cond_0

    .line 186
    aget-object p2, v0, p1

    :cond_0
    if-eqz p2, :cond_1

    .line 187
    iget-object p3, p2, Lc/b/k/l0;->j:Lc/b/p/o/m;

    :cond_1
    if-eqz p2, :cond_2

    .line 188
    iget-boolean p2, p2, Lc/b/k/l0;->o:Z

    if-nez p2, :cond_2

    return-void

    .line 189
    :cond_2
    iget-boolean p2, p0, Lc/b/k/n0;->N:Z

    if-nez p2, :cond_3

    .line 190
    iget-object p2, p0, Lc/b/k/n0;->h:Lc/b/k/f0;

    invoke-virtual {p2}, Lc/b/p/n;->a()Landroid/view/Window$Callback;

    move-result-object p2

    invoke-interface {p2, p1, p3}, Landroid/view/Window$Callback;->onPanelClosed(ILandroid/view/Menu;)V

    :cond_3
    return-void
.end method

.method public a(Landroid/content/Context;)V
    .locals 0

    const/4 p1, 0x0

    .line 1
    invoke-virtual {p0, p1}, Lc/b/k/n0;->a(Z)Z

    const/4 p1, 0x1

    .line 2
    iput-boolean p1, p0, Lc/b/k/n0;->K:Z

    return-void
.end method

.method public a(Landroid/content/res/Configuration;)V
    .locals 1

    .line 26
    iget-boolean v0, p0, Lc/b/k/n0;->B:Z

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lc/b/k/n0;->v:Z

    if-eqz v0, :cond_0

    .line 27
    invoke-virtual {p0}, Lc/b/k/n0;->c()Lc/b/k/a;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 28
    invoke-virtual {v0, p1}, Lc/b/k/a;->a(Landroid/content/res/Configuration;)V

    .line 29
    :cond_0
    invoke-static {}, Lc/b/q/s;->b()Lc/b/q/s;

    move-result-object p1

    iget-object v0, p0, Lc/b/k/n0;->f:Landroid/content/Context;

    invoke-virtual {p1, v0}, Lc/b/q/s;->a(Landroid/content/Context;)V

    const/4 p1, 0x0

    .line 30
    invoke-virtual {p0, p1}, Lc/b/k/n0;->a(Z)Z

    return-void
.end method

.method public a(Landroid/os/Bundle;)V
    .locals 2

    const/4 p1, 0x1

    .line 3
    iput-boolean p1, p0, Lc/b/k/n0;->K:Z

    const/4 v0, 0x0

    .line 4
    invoke-virtual {p0, v0}, Lc/b/k/n0;->a(Z)Z

    .line 5
    invoke-virtual {p0}, Lc/b/k/n0;->s()V

    .line 6
    iget-object v0, p0, Lc/b/k/n0;->e:Ljava/lang/Object;

    instance-of v1, v0, Landroid/app/Activity;

    if-eqz v1, :cond_1

    const/4 v1, 0x0

    .line 7
    :try_start_0
    check-cast v0, Landroid/app/Activity;

    invoke-static {v0}, Lc/h/e/r;->b(Landroid/app/Activity;)Ljava/lang/String;

    move-result-object v1
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    nop

    :goto_0
    if-eqz v1, :cond_1

    .line 8
    invoke-virtual {p0}, Lc/b/k/n0;->C()Lc/b/k/a;

    move-result-object v0

    if-nez v0, :cond_0

    .line 9
    iput-boolean p1, p0, Lc/b/k/n0;->X:Z

    goto :goto_1

    .line 10
    :cond_0
    invoke-virtual {v0, p1}, Lc/b/k/a;->c(Z)V

    .line 11
    :cond_1
    :goto_1
    iput-boolean p1, p0, Lc/b/k/n0;->L:Z

    return-void
.end method

.method public a(Landroid/view/View;)V
    .locals 2

    .line 31
    invoke-virtual {p0}, Lc/b/k/n0;->r()V

    .line 32
    iget-object v0, p0, Lc/b/k/n0;->w:Landroid/view/ViewGroup;

    const v1, 0x1020002

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    .line 33
    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 34
    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 35
    iget-object p1, p0, Lc/b/k/n0;->h:Lc/b/k/f0;

    invoke-virtual {p1}, Lc/b/p/n;->a()Landroid/view/Window$Callback;

    move-result-object p1

    invoke-interface {p1}, Landroid/view/Window$Callback;->onContentChanged()V

    return-void
.end method

.method public a(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 2

    .line 36
    invoke-virtual {p0}, Lc/b/k/n0;->r()V

    .line 37
    iget-object v0, p0, Lc/b/k/n0;->w:Landroid/view/ViewGroup;

    const v1, 0x1020002

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    .line 38
    invoke-virtual {v0, p1, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 39
    iget-object p1, p0, Lc/b/k/n0;->h:Lc/b/k/f0;

    invoke-virtual {p1}, Lc/b/p/n;->a()Landroid/view/Window$Callback;

    move-result-object p1

    invoke-interface {p1}, Landroid/view/Window$Callback;->onContentChanged()V

    return-void
.end method

.method public a(Landroid/view/ViewGroup;)V
    .locals 0

    return-void
.end method

.method public final a(Landroid/view/Window;)V
    .locals 3

    .line 40
    iget-object v0, p0, Lc/b/k/n0;->g:Landroid/view/Window;

    const-string v1, "AppCompat has already installed itself into the Window"

    if-nez v0, :cond_2

    .line 41
    invoke-virtual {p1}, Landroid/view/Window;->getCallback()Landroid/view/Window$Callback;

    move-result-object v0

    .line 42
    instance-of v2, v0, Lc/b/k/f0;

    if-nez v2, :cond_1

    .line 43
    new-instance v1, Lc/b/k/f0;

    invoke-direct {v1, p0, v0}, Lc/b/k/f0;-><init>(Lc/b/k/n0;Landroid/view/Window$Callback;)V

    iput-object v1, p0, Lc/b/k/n0;->h:Lc/b/k/f0;

    .line 44
    invoke-virtual {p1, v1}, Landroid/view/Window;->setCallback(Landroid/view/Window$Callback;)V

    .line 45
    iget-object v0, p0, Lc/b/k/n0;->f:Landroid/content/Context;

    const/4 v1, 0x0

    sget-object v2, Lc/b/k/n0;->d0:[I

    invoke-static {v0, v1, v2}, Lc/b/q/k2;->a(Landroid/content/Context;Landroid/util/AttributeSet;[I)Lc/b/q/k2;

    move-result-object v0

    const/4 v1, 0x0

    .line 46
    invoke-virtual {v0, v1}, Lc/b/q/k2;->c(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 47
    invoke-virtual {p1, v1}, Landroid/view/Window;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 48
    :cond_0
    invoke-virtual {v0}, Lc/b/q/k2;->a()V

    .line 49
    iput-object p1, p0, Lc/b/k/n0;->g:Landroid/view/Window;

    return-void

    .line 50
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 51
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public a(Landroidx/appcompat/widget/Toolbar;)V
    .locals 3

    .line 12
    iget-object v0, p0, Lc/b/k/n0;->e:Ljava/lang/Object;

    instance-of v0, v0, Landroid/app/Activity;

    if-nez v0, :cond_0

    return-void

    .line 13
    :cond_0
    invoke-virtual {p0}, Lc/b/k/n0;->c()Lc/b/k/a;

    move-result-object v0

    .line 14
    instance-of v1, v0, Lc/b/k/f1;

    if-nez v1, :cond_3

    const/4 v1, 0x0

    .line 15
    iput-object v1, p0, Lc/b/k/n0;->k:Landroid/view/MenuInflater;

    if-eqz v0, :cond_1

    .line 16
    invoke-virtual {v0}, Lc/b/k/a;->j()V

    :cond_1
    if-eqz p1, :cond_2

    .line 17
    new-instance v0, Lc/b/k/x0;

    invoke-virtual {p0}, Lc/b/k/n0;->w()Ljava/lang/CharSequence;

    move-result-object v1

    iget-object v2, p0, Lc/b/k/n0;->h:Lc/b/k/f0;

    invoke-direct {v0, p1, v1, v2}, Lc/b/k/x0;-><init>(Landroidx/appcompat/widget/Toolbar;Ljava/lang/CharSequence;Landroid/view/Window$Callback;)V

    .line 18
    iput-object v0, p0, Lc/b/k/n0;->j:Lc/b/k/a;

    .line 19
    iget-object p1, p0, Lc/b/k/n0;->g:Landroid/view/Window;

    invoke-virtual {v0}, Lc/b/k/x0;->m()Landroid/view/Window$Callback;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/view/Window;->setCallback(Landroid/view/Window$Callback;)V

    goto :goto_0

    .line 20
    :cond_2
    iput-object v1, p0, Lc/b/k/n0;->j:Lc/b/k/a;

    .line 21
    iget-object p1, p0, Lc/b/k/n0;->g:Landroid/view/Window;

    iget-object v0, p0, Lc/b/k/n0;->h:Lc/b/k/f0;

    invoke-virtual {p1, v0}, Landroid/view/Window;->setCallback(Landroid/view/Window$Callback;)V

    .line 22
    :goto_0
    invoke-virtual {p0}, Lc/b/k/n0;->e()V

    return-void

    .line 23
    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final a(Lc/b/k/l0;Landroid/view/KeyEvent;)V
    .locals 13

    .line 108
    iget-boolean v0, p1, Lc/b/k/l0;->o:Z

    if-nez v0, :cond_f

    iget-boolean v0, p0, Lc/b/k/n0;->N:Z

    if-eqz v0, :cond_0

    goto/16 :goto_3

    .line 109
    :cond_0
    iget v0, p1, Lc/b/k/l0;->a:I

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-nez v0, :cond_2

    .line 110
    iget-object v0, p0, Lc/b/k/n0;->f:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    .line 111
    iget v0, v0, Landroid/content/res/Configuration;->screenLayout:I

    and-int/lit8 v0, v0, 0xf

    const/4 v3, 0x4

    if-ne v0, v3, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_2

    return-void

    .line 112
    :cond_2
    invoke-virtual {p0}, Lc/b/k/n0;->x()Landroid/view/Window$Callback;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 113
    iget v3, p1, Lc/b/k/l0;->a:I

    iget-object v4, p1, Lc/b/k/l0;->j:Lc/b/p/o/m;

    invoke-interface {v0, v3, v4}, Landroid/view/Window$Callback;->onMenuOpened(ILandroid/view/Menu;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 114
    invoke-virtual {p0, p1, v2}, Lc/b/k/n0;->a(Lc/b/k/l0;Z)V

    return-void

    .line 115
    :cond_3
    iget-object v0, p0, Lc/b/k/n0;->f:Landroid/content/Context;

    const-string v3, "window"

    invoke-virtual {v0, v3}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/WindowManager;

    if-nez v0, :cond_4

    return-void

    .line 116
    :cond_4
    invoke-virtual {p0, p1, p2}, Lc/b/k/n0;->b(Lc/b/k/l0;Landroid/view/KeyEvent;)Z

    move-result p2

    if-nez p2, :cond_5

    return-void

    .line 117
    :cond_5
    iget-object p2, p1, Lc/b/k/l0;->g:Landroid/view/ViewGroup;

    const/4 v3, -0x1

    const/4 v4, -0x2

    if-eqz p2, :cond_7

    iget-boolean p2, p1, Lc/b/k/l0;->q:Z

    if-eqz p2, :cond_6

    goto :goto_1

    .line 118
    :cond_6
    iget-object p2, p1, Lc/b/k/l0;->i:Landroid/view/View;

    if-eqz p2, :cond_e

    .line 119
    invoke-virtual {p2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p2

    if-eqz p2, :cond_e

    .line 120
    iget p2, p2, Landroid/view/ViewGroup$LayoutParams;->width:I

    if-ne p2, v3, :cond_e

    const/4 v6, -0x1

    goto :goto_2

    .line 121
    :cond_7
    :goto_1
    iget-object p2, p1, Lc/b/k/l0;->g:Landroid/view/ViewGroup;

    if-nez p2, :cond_9

    .line 122
    invoke-virtual {p0, p1}, Lc/b/k/n0;->b(Lc/b/k/l0;)Z

    move-result p2

    if-eqz p2, :cond_8

    iget-object p2, p1, Lc/b/k/l0;->g:Landroid/view/ViewGroup;

    if-nez p2, :cond_a

    :cond_8
    return-void

    .line 123
    :cond_9
    iget-boolean v3, p1, Lc/b/k/l0;->q:Z

    if-eqz v3, :cond_a

    invoke-virtual {p2}, Landroid/view/ViewGroup;->getChildCount()I

    move-result p2

    if-lez p2, :cond_a

    .line 124
    iget-object p2, p1, Lc/b/k/l0;->g:Landroid/view/ViewGroup;

    invoke-virtual {p2}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 125
    :cond_a
    invoke-virtual {p0, p1}, Lc/b/k/n0;->a(Lc/b/k/l0;)Z

    move-result p2

    if-eqz p2, :cond_f

    invoke-virtual {p1}, Lc/b/k/l0;->a()Z

    move-result p2

    if-nez p2, :cond_b

    goto :goto_3

    .line 126
    :cond_b
    iget-object p2, p1, Lc/b/k/l0;->h:Landroid/view/View;

    invoke-virtual {p2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p2

    if-nez p2, :cond_c

    .line 127
    new-instance p2, Landroid/view/ViewGroup$LayoutParams;

    invoke-direct {p2, v4, v4}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    .line 128
    :cond_c
    iget v3, p1, Lc/b/k/l0;->b:I

    .line 129
    iget-object v5, p1, Lc/b/k/l0;->g:Landroid/view/ViewGroup;

    invoke-virtual {v5, v3}, Landroid/view/ViewGroup;->setBackgroundResource(I)V

    .line 130
    iget-object v3, p1, Lc/b/k/l0;->h:Landroid/view/View;

    invoke-virtual {v3}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v3

    .line 131
    instance-of v5, v3, Landroid/view/ViewGroup;

    if-eqz v5, :cond_d

    .line 132
    check-cast v3, Landroid/view/ViewGroup;

    iget-object v5, p1, Lc/b/k/l0;->h:Landroid/view/View;

    invoke-virtual {v3, v5}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 133
    :cond_d
    iget-object v3, p1, Lc/b/k/l0;->g:Landroid/view/ViewGroup;

    iget-object v5, p1, Lc/b/k/l0;->h:Landroid/view/View;

    invoke-virtual {v3, v5, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 134
    iget-object p2, p1, Lc/b/k/l0;->h:Landroid/view/View;

    invoke-virtual {p2}, Landroid/view/View;->hasFocus()Z

    move-result p2

    if-nez p2, :cond_e

    .line 135
    iget-object p2, p1, Lc/b/k/l0;->h:Landroid/view/View;

    invoke-virtual {p2}, Landroid/view/View;->requestFocus()Z

    :cond_e
    const/4 v6, -0x2

    .line 136
    :goto_2
    iput-boolean v1, p1, Lc/b/k/l0;->n:Z

    .line 137
    new-instance p2, Landroid/view/WindowManager$LayoutParams;

    const/4 v7, -0x2

    iget v8, p1, Lc/b/k/l0;->d:I

    iget v9, p1, Lc/b/k/l0;->e:I

    const/16 v10, 0x3ea

    const/high16 v11, 0x820000

    const/4 v12, -0x3

    move-object v5, p2

    invoke-direct/range {v5 .. v12}, Landroid/view/WindowManager$LayoutParams;-><init>(IIIIIII)V

    .line 138
    iget v1, p1, Lc/b/k/l0;->c:I

    iput v1, p2, Landroid/view/WindowManager$LayoutParams;->gravity:I

    .line 139
    iget v1, p1, Lc/b/k/l0;->f:I

    iput v1, p2, Landroid/view/WindowManager$LayoutParams;->windowAnimations:I

    .line 140
    iget-object v1, p1, Lc/b/k/l0;->g:Landroid/view/ViewGroup;

    invoke-interface {v0, v1, p2}, Landroid/view/WindowManager;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 141
    iput-boolean v2, p1, Lc/b/k/l0;->o:Z

    :cond_f
    :goto_3
    return-void
.end method

.method public a(Lc/b/k/l0;Z)V
    .locals 3

    if-eqz p2, :cond_0

    .line 171
    iget v0, p1, Lc/b/k/l0;->a:I

    if-nez v0, :cond_0

    iget-object v0, p0, Lc/b/k/n0;->m:Lc/b/q/y0;

    if-eqz v0, :cond_0

    .line 172
    invoke-interface {v0}, Lc/b/q/y0;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 173
    iget-object p1, p1, Lc/b/k/l0;->j:Lc/b/p/o/m;

    invoke-virtual {p0, p1}, Lc/b/k/n0;->b(Lc/b/p/o/m;)V

    return-void

    .line 174
    :cond_0
    iget-object v0, p0, Lc/b/k/n0;->f:Landroid/content/Context;

    const-string v1, "window"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/WindowManager;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    .line 175
    iget-boolean v2, p1, Lc/b/k/l0;->o:Z

    if-eqz v2, :cond_1

    iget-object v2, p1, Lc/b/k/l0;->g:Landroid/view/ViewGroup;

    if-eqz v2, :cond_1

    .line 176
    invoke-interface {v0, v2}, Landroid/view/WindowManager;->removeView(Landroid/view/View;)V

    if-eqz p2, :cond_1

    .line 177
    iget p2, p1, Lc/b/k/l0;->a:I

    invoke-virtual {p0, p2, p1, v1}, Lc/b/k/n0;->a(ILc/b/k/l0;Landroid/view/Menu;)V

    :cond_1
    const/4 p2, 0x0

    .line 178
    iput-boolean p2, p1, Lc/b/k/l0;->m:Z

    .line 179
    iput-boolean p2, p1, Lc/b/k/l0;->n:Z

    .line 180
    iput-boolean p2, p1, Lc/b/k/l0;->o:Z

    .line 181
    iput-object v1, p1, Lc/b/k/l0;->h:Landroid/view/View;

    const/4 p2, 0x1

    .line 182
    iput-boolean p2, p1, Lc/b/k/l0;->q:Z

    .line 183
    iget-object p2, p0, Lc/b/k/n0;->I:Lc/b/k/l0;

    if-ne p2, p1, :cond_2

    .line 184
    iput-object v1, p0, Lc/b/k/n0;->I:Lc/b/k/l0;

    :cond_2
    return-void
.end method

.method public a(Lc/b/p/o/m;)V
    .locals 1

    const/4 v0, 0x1

    .line 63
    invoke-virtual {p0, p1, v0}, Lc/b/k/n0;->a(Lc/b/p/o/m;Z)V

    return-void
.end method

.method public final a(Lc/b/p/o/m;Z)V
    .locals 4

    .line 142
    iget-object p1, p0, Lc/b/k/n0;->m:Lc/b/q/y0;

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-eqz p1, :cond_5

    invoke-interface {p1}, Lc/b/q/y0;->f()Z

    move-result p1

    if-eqz p1, :cond_5

    iget-object p1, p0, Lc/b/k/n0;->f:Landroid/content/Context;

    .line 143
    invoke-static {p1}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/ViewConfiguration;->hasPermanentMenuKey()Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lc/b/k/n0;->m:Lc/b/q/y0;

    .line 144
    invoke-interface {p1}, Lc/b/q/y0;->a()Z

    move-result p1

    if-eqz p1, :cond_5

    .line 145
    :cond_0
    invoke-virtual {p0}, Lc/b/k/n0;->x()Landroid/view/Window$Callback;

    move-result-object p1

    .line 146
    iget-object v2, p0, Lc/b/k/n0;->m:Lc/b/q/y0;

    invoke-interface {v2}, Lc/b/q/y0;->b()Z

    move-result v2

    const/16 v3, 0x6c

    if-eqz v2, :cond_2

    if-nez p2, :cond_1

    goto :goto_0

    .line 147
    :cond_1
    iget-object p2, p0, Lc/b/k/n0;->m:Lc/b/q/y0;

    invoke-interface {p2}, Lc/b/q/y0;->c()Z

    .line 148
    iget-boolean p2, p0, Lc/b/k/n0;->N:Z

    if-nez p2, :cond_4

    .line 149
    invoke-virtual {p0, v1, v0}, Lc/b/k/n0;->a(IZ)Lc/b/k/l0;

    move-result-object p2

    .line 150
    iget-object p2, p2, Lc/b/k/l0;->j:Lc/b/p/o/m;

    invoke-interface {p1, v3, p2}, Landroid/view/Window$Callback;->onPanelClosed(ILandroid/view/Menu;)V

    goto :goto_1

    :cond_2
    :goto_0
    if-eqz p1, :cond_4

    .line 151
    iget-boolean p2, p0, Lc/b/k/n0;->N:Z

    if-nez p2, :cond_4

    .line 152
    iget-boolean p2, p0, Lc/b/k/n0;->U:Z

    if-eqz p2, :cond_3

    iget p2, p0, Lc/b/k/n0;->V:I

    and-int/2addr p2, v0

    if-eqz p2, :cond_3

    .line 153
    iget-object p2, p0, Lc/b/k/n0;->g:Landroid/view/Window;

    invoke-virtual {p2}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object p2

    iget-object v2, p0, Lc/b/k/n0;->W:Ljava/lang/Runnable;

    invoke-virtual {p2, v2}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 154
    iget-object p2, p0, Lc/b/k/n0;->W:Ljava/lang/Runnable;

    invoke-interface {p2}, Ljava/lang/Runnable;->run()V

    .line 155
    :cond_3
    invoke-virtual {p0, v1, v0}, Lc/b/k/n0;->a(IZ)Lc/b/k/l0;

    move-result-object p2

    .line 156
    iget-object v0, p2, Lc/b/k/l0;->j:Lc/b/p/o/m;

    if-eqz v0, :cond_4

    iget-boolean v2, p2, Lc/b/k/l0;->r:Z

    if-nez v2, :cond_4

    iget-object v2, p2, Lc/b/k/l0;->i:Landroid/view/View;

    .line 157
    invoke-interface {p1, v1, v2, v0}, Landroid/view/Window$Callback;->onPreparePanel(ILandroid/view/View;Landroid/view/Menu;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 158
    iget-object p2, p2, Lc/b/k/l0;->j:Lc/b/p/o/m;

    invoke-interface {p1, v3, p2}, Landroid/view/Window$Callback;->onMenuOpened(ILandroid/view/Menu;)Z

    .line 159
    iget-object p1, p0, Lc/b/k/n0;->m:Lc/b/q/y0;

    invoke-interface {p1}, Lc/b/q/y0;->d()Z

    :cond_4
    :goto_1
    return-void

    .line 160
    :cond_5
    invoke-virtual {p0, v1, v0}, Lc/b/k/n0;->a(IZ)Lc/b/k/l0;

    move-result-object p1

    .line 161
    iput-boolean v0, p1, Lc/b/k/l0;->q:Z

    .line 162
    invoke-virtual {p0, p1, v1}, Lc/b/k/n0;->a(Lc/b/k/l0;Z)V

    const/4 p2, 0x0

    .line 163
    invoke-virtual {p0, p1, p2}, Lc/b/k/n0;->a(Lc/b/k/l0;Landroid/view/KeyEvent;)V

    return-void
.end method

.method public final a(Ljava/lang/CharSequence;)V
    .locals 1

    .line 52
    iput-object p1, p0, Lc/b/k/n0;->l:Ljava/lang/CharSequence;

    .line 53
    iget-object v0, p0, Lc/b/k/n0;->m:Lc/b/q/y0;

    if-eqz v0, :cond_0

    .line 54
    invoke-interface {v0, p1}, Lc/b/q/y0;->setWindowTitle(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 55
    :cond_0
    invoke-virtual {p0}, Lc/b/k/n0;->C()Lc/b/k/a;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 56
    invoke-virtual {p0}, Lc/b/k/n0;->C()Lc/b/k/a;

    move-result-object v0

    invoke-virtual {v0, p1}, Lc/b/k/a;->b(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 57
    :cond_1
    iget-object v0, p0, Lc/b/k/n0;->x:Landroid/widget/TextView;

    if-eqz v0, :cond_2

    .line 58
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_2
    :goto_0
    return-void
.end method

.method public a(ILandroid/view/KeyEvent;)Z
    .locals 3

    const/4 v0, 0x4

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eq p1, v0, :cond_1

    const/16 v0, 0x52

    if-eq p1, v0, :cond_0

    goto :goto_1

    .line 83
    :cond_0
    invoke-virtual {p0, v2, p2}, Lc/b/k/n0;->b(ILandroid/view/KeyEvent;)Z

    return v1

    .line 84
    :cond_1
    invoke-virtual {p2}, Landroid/view/KeyEvent;->getFlags()I

    move-result p1

    and-int/lit16 p1, p1, 0x80

    if-eqz p1, :cond_2

    goto :goto_0

    :cond_2
    const/4 v1, 0x0

    :goto_0
    iput-boolean v1, p0, Lc/b/k/n0;->J:Z

    :goto_1
    return v2
.end method

.method public a(Landroid/view/KeyEvent;)Z
    .locals 3

    .line 75
    iget-object v0, p0, Lc/b/k/n0;->e:Ljava/lang/Object;

    instance-of v1, v0, Lc/h/n/j;

    const/4 v2, 0x1

    if-nez v1, :cond_0

    instance-of v0, v0, Lc/b/k/p0;

    if-eqz v0, :cond_1

    .line 76
    :cond_0
    iget-object v0, p0, Lc/b/k/n0;->g:Landroid/view/Window;

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 77
    invoke-static {v0, p1}, Lc/h/n/k;->a(Landroid/view/View;Landroid/view/KeyEvent;)Z

    move-result v0

    if-eqz v0, :cond_1

    return v2

    .line 78
    :cond_1
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result v0

    const/16 v1, 0x52

    if-ne v0, v1, :cond_2

    .line 79
    iget-object v0, p0, Lc/b/k/n0;->h:Lc/b/k/f0;

    invoke-virtual {v0}, Lc/b/p/n;->a()Landroid/view/Window$Callback;

    move-result-object v0

    invoke-interface {v0, p1}, Landroid/view/Window$Callback;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    move-result v0

    if-eqz v0, :cond_2

    return v2

    .line 80
    :cond_2
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result v0

    .line 81
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getAction()I

    move-result v1

    if-nez v1, :cond_3

    goto :goto_0

    :cond_3
    const/4 v2, 0x0

    :goto_0
    if-eqz v2, :cond_4

    .line 82
    invoke-virtual {p0, v0, p1}, Lc/b/k/n0;->a(ILandroid/view/KeyEvent;)Z

    move-result p1

    goto :goto_1

    :cond_4
    invoke-virtual {p0, v0, p1}, Lc/b/k/n0;->d(ILandroid/view/KeyEvent;)Z

    move-result p1

    :goto_1
    return p1
.end method

.method public final a(Landroid/view/ViewParent;)Z
    .locals 3

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    .line 104
    :cond_0
    iget-object v1, p0, Lc/b/k/n0;->g:Landroid/view/Window;

    invoke-virtual {v1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v1

    :goto_0
    if-nez p1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    if-eq p1, v1, :cond_3

    .line 105
    instance-of v2, p1, Landroid/view/View;

    if-eqz v2, :cond_3

    move-object v2, p1

    check-cast v2, Landroid/view/View;

    .line 106
    invoke-static {v2}, Lc/h/n/v0;->C(Landroid/view/View;)Z

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_1

    .line 107
    :cond_2
    invoke-interface {p1}, Landroid/view/ViewParent;->getParent()Landroid/view/ViewParent;

    move-result-object p1

    goto :goto_0

    :cond_3
    :goto_1
    return v0
.end method

.method public final a(Lc/b/k/l0;)Z
    .locals 3

    .line 164
    iget-object v0, p1, Lc/b/k/l0;->i:Landroid/view/View;

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    .line 165
    iput-object v0, p1, Lc/b/k/l0;->h:Landroid/view/View;

    return v1

    .line 166
    :cond_0
    iget-object v0, p1, Lc/b/k/l0;->j:Lc/b/p/o/m;

    const/4 v2, 0x0

    if-nez v0, :cond_1

    return v2

    .line 167
    :cond_1
    iget-object v0, p0, Lc/b/k/n0;->o:Lc/b/k/m0;

    if-nez v0, :cond_2

    .line 168
    new-instance v0, Lc/b/k/m0;

    invoke-direct {v0, p0}, Lc/b/k/m0;-><init>(Lc/b/k/n0;)V

    iput-object v0, p0, Lc/b/k/n0;->o:Lc/b/k/m0;

    .line 169
    :cond_2
    iget-object v0, p0, Lc/b/k/n0;->o:Lc/b/k/m0;

    invoke-virtual {p1, v0}, Lc/b/k/l0;->a(Lc/b/p/o/z$a;)Lc/b/p/o/a0;

    move-result-object v0

    .line 170
    check-cast v0, Landroid/view/View;

    iput-object v0, p1, Lc/b/k/l0;->h:Landroid/view/View;

    if-eqz v0, :cond_3

    goto :goto_0

    :cond_3
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method public final a(Lc/b/k/l0;ILandroid/view/KeyEvent;I)Z
    .locals 2

    .line 201
    invoke-virtual {p3}, Landroid/view/KeyEvent;->isSystem()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return v1

    .line 202
    :cond_0
    iget-boolean v0, p1, Lc/b/k/l0;->m:Z

    if-nez v0, :cond_1

    invoke-virtual {p0, p1, p3}, Lc/b/k/n0;->b(Lc/b/k/l0;Landroid/view/KeyEvent;)Z

    move-result v0

    if-eqz v0, :cond_2

    :cond_1
    iget-object v0, p1, Lc/b/k/l0;->j:Lc/b/p/o/m;

    if-eqz v0, :cond_2

    .line 203
    invoke-virtual {v0, p2, p3, p4}, Lc/b/p/o/m;->performShortcut(ILandroid/view/KeyEvent;I)Z

    move-result v1

    :cond_2
    if-eqz v1, :cond_3

    const/4 p2, 0x1

    and-int/lit8 p3, p4, 0x1

    if-nez p3, :cond_3

    .line 204
    iget-object p3, p0, Lc/b/k/n0;->m:Lc/b/q/y0;

    if-nez p3, :cond_3

    .line 205
    invoke-virtual {p0, p1, p2}, Lc/b/k/n0;->a(Lc/b/k/l0;Z)V

    :cond_3
    return v1
.end method

.method public a(Lc/b/p/o/m;Landroid/view/MenuItem;)Z
    .locals 2

    .line 59
    invoke-virtual {p0}, Lc/b/k/n0;->x()Landroid/view/Window$Callback;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 60
    iget-boolean v1, p0, Lc/b/k/n0;->N:Z

    if-nez v1, :cond_0

    .line 61
    invoke-virtual {p1}, Lc/b/p/o/m;->m()Lc/b/p/o/m;

    move-result-object p1

    invoke-virtual {p0, p1}, Lc/b/k/n0;->a(Landroid/view/Menu;)Lc/b/k/l0;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 62
    iget p1, p1, Lc/b/k/l0;->a:I

    invoke-interface {v0, p1, p2}, Landroid/view/Window$Callback;->onMenuItemSelected(ILandroid/view/MenuItem;)Z

    move-result p1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final a(Z)Z
    .locals 2

    .line 206
    iget-boolean v0, p0, Lc/b/k/n0;->N:Z

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    return p1

    .line 207
    :cond_0
    invoke-virtual {p0}, Lc/b/k/n0;->m()I

    move-result v0

    .line 208
    invoke-virtual {p0, v0}, Lc/b/k/n0;->h(I)I

    move-result v1

    .line 209
    invoke-virtual {p0, v1, p1}, Lc/b/k/n0;->b(IZ)Z

    move-result p1

    if-nez v0, :cond_1

    .line 210
    invoke-virtual {p0}, Lc/b/k/n0;->v()Lc/b/k/i0;

    move-result-object v1

    invoke-virtual {v1}, Lc/b/k/i0;->e()V

    goto :goto_0

    .line 211
    :cond_1
    iget-object v1, p0, Lc/b/k/n0;->S:Lc/b/k/i0;

    if-eqz v1, :cond_2

    .line 212
    invoke-virtual {v1}, Lc/b/k/i0;->a()V

    :cond_2
    :goto_0
    const/4 v1, 0x3

    if-ne v0, v1, :cond_3

    .line 213
    invoke-virtual {p0}, Lc/b/k/n0;->u()Lc/b/k/i0;

    move-result-object v0

    invoke-virtual {v0}, Lc/b/k/i0;->e()V

    goto :goto_1

    .line 214
    :cond_3
    iget-object v0, p0, Lc/b/k/n0;->T:Lc/b/k/i0;

    if-eqz v0, :cond_4

    .line 215
    invoke-virtual {v0}, Lc/b/k/i0;->a()V

    :cond_4
    :goto_1
    return p1
.end method

.method public b()Landroid/view/MenuInflater;
    .locals 2

    .line 2
    iget-object v0, p0, Lc/b/k/n0;->k:Landroid/view/MenuInflater;

    if-nez v0, :cond_1

    .line 3
    invoke-virtual {p0}, Lc/b/k/n0;->y()V

    .line 4
    new-instance v0, Lc/b/p/k;

    iget-object v1, p0, Lc/b/k/n0;->j:Lc/b/k/a;

    if-eqz v1, :cond_0

    .line 5
    invoke-virtual {v1}, Lc/b/k/a;->h()Landroid/content/Context;

    move-result-object v1

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lc/b/k/n0;->f:Landroid/content/Context;

    :goto_0
    invoke-direct {v0, v1}, Lc/b/p/k;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lc/b/k/n0;->k:Landroid/view/MenuInflater;

    .line 6
    :cond_1
    iget-object v0, p0, Lc/b/k/n0;->k:Landroid/view/MenuInflater;

    return-object v0
.end method

.method public b(Lc/b/p/b;)Lc/b/p/c;
    .locals 7

    .line 29
    invoke-virtual {p0}, Lc/b/k/n0;->q()V

    .line 30
    iget-object v0, p0, Lc/b/k/n0;->p:Lc/b/p/c;

    if-eqz v0, :cond_0

    .line 31
    invoke-virtual {v0}, Lc/b/p/c;->a()V

    .line 32
    :cond_0
    instance-of v0, p1, Lc/b/k/e0;

    if-nez v0, :cond_1

    .line 33
    new-instance v0, Lc/b/k/e0;

    invoke-direct {v0, p0, p1}, Lc/b/k/e0;-><init>(Lc/b/k/n0;Lc/b/p/b;)V

    move-object p1, v0

    .line 34
    :cond_1
    iget-object v0, p0, Lc/b/k/n0;->i:Lc/b/k/s;

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    iget-boolean v2, p0, Lc/b/k/n0;->N:Z

    if-nez v2, :cond_2

    .line 35
    :try_start_0
    invoke-interface {v0, p1}, Lc/b/k/s;->a(Lc/b/p/b;)Lc/b/p/c;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/AbstractMethodError; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    :cond_2
    move-object v0, v1

    :goto_0
    if-eqz v0, :cond_3

    .line 36
    iput-object v0, p0, Lc/b/k/n0;->p:Lc/b/p/c;

    goto/16 :goto_5

    .line 37
    :cond_3
    iget-object v0, p0, Lc/b/k/n0;->q:Landroidx/appcompat/widget/ActionBarContextView;

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-nez v0, :cond_6

    .line 38
    iget-boolean v0, p0, Lc/b/k/n0;->E:Z

    if-eqz v0, :cond_5

    .line 39
    new-instance v0, Landroid/util/TypedValue;

    invoke-direct {v0}, Landroid/util/TypedValue;-><init>()V

    .line 40
    iget-object v4, p0, Lc/b/k/n0;->f:Landroid/content/Context;

    invoke-virtual {v4}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v4

    .line 41
    sget v5, Lc/b/a;->actionBarTheme:I

    invoke-virtual {v4, v5, v0, v3}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    .line 42
    iget v5, v0, Landroid/util/TypedValue;->resourceId:I

    if-eqz v5, :cond_4

    .line 43
    iget-object v5, p0, Lc/b/k/n0;->f:Landroid/content/Context;

    invoke-virtual {v5}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    invoke-virtual {v5}, Landroid/content/res/Resources;->newTheme()Landroid/content/res/Resources$Theme;

    move-result-object v5

    .line 44
    invoke-virtual {v5, v4}, Landroid/content/res/Resources$Theme;->setTo(Landroid/content/res/Resources$Theme;)V

    .line 45
    iget v4, v0, Landroid/util/TypedValue;->resourceId:I

    invoke-virtual {v5, v4, v3}, Landroid/content/res/Resources$Theme;->applyStyle(IZ)V

    .line 46
    new-instance v4, Lc/b/p/e;

    iget-object v6, p0, Lc/b/k/n0;->f:Landroid/content/Context;

    invoke-direct {v4, v6, v2}, Lc/b/p/e;-><init>(Landroid/content/Context;I)V

    .line 47
    invoke-virtual {v4}, Lc/b/p/e;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v6

    invoke-virtual {v6, v5}, Landroid/content/res/Resources$Theme;->setTo(Landroid/content/res/Resources$Theme;)V

    goto :goto_1

    .line 48
    :cond_4
    iget-object v4, p0, Lc/b/k/n0;->f:Landroid/content/Context;

    .line 49
    :goto_1
    new-instance v5, Landroidx/appcompat/widget/ActionBarContextView;

    invoke-direct {v5, v4}, Landroidx/appcompat/widget/ActionBarContextView;-><init>(Landroid/content/Context;)V

    iput-object v5, p0, Lc/b/k/n0;->q:Landroidx/appcompat/widget/ActionBarContextView;

    .line 50
    new-instance v5, Landroid/widget/PopupWindow;

    sget v6, Lc/b/a;->actionModePopupWindowStyle:I

    invoke-direct {v5, v4, v1, v6}, Landroid/widget/PopupWindow;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    iput-object v5, p0, Lc/b/k/n0;->r:Landroid/widget/PopupWindow;

    const/4 v6, 0x2

    .line 51
    invoke-static {v5, v6}, Lc/h/o/n;->a(Landroid/widget/PopupWindow;I)V

    .line 52
    iget-object v5, p0, Lc/b/k/n0;->r:Landroid/widget/PopupWindow;

    iget-object v6, p0, Lc/b/k/n0;->q:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {v5, v6}, Landroid/widget/PopupWindow;->setContentView(Landroid/view/View;)V

    .line 53
    iget-object v5, p0, Lc/b/k/n0;->r:Landroid/widget/PopupWindow;

    const/4 v6, -0x1

    invoke-virtual {v5, v6}, Landroid/widget/PopupWindow;->setWidth(I)V

    .line 54
    invoke-virtual {v4}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v5

    sget v6, Lc/b/a;->actionBarSize:I

    invoke-virtual {v5, v6, v0, v3}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    .line 55
    iget v0, v0, Landroid/util/TypedValue;->data:I

    .line 56
    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    invoke-virtual {v4}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v4

    .line 57
    invoke-static {v0, v4}, Landroid/util/TypedValue;->complexToDimensionPixelSize(ILandroid/util/DisplayMetrics;)I

    move-result v0

    .line 58
    iget-object v4, p0, Lc/b/k/n0;->q:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {v4, v0}, Landroidx/appcompat/widget/ActionBarContextView;->setContentHeight(I)V

    .line 59
    iget-object v0, p0, Lc/b/k/n0;->r:Landroid/widget/PopupWindow;

    const/4 v4, -0x2

    invoke-virtual {v0, v4}, Landroid/widget/PopupWindow;->setHeight(I)V

    .line 60
    new-instance v0, Lc/b/k/a0;

    invoke-direct {v0, p0}, Lc/b/k/a0;-><init>(Lc/b/k/n0;)V

    iput-object v0, p0, Lc/b/k/n0;->s:Ljava/lang/Runnable;

    goto :goto_2

    .line 61
    :cond_5
    iget-object v0, p0, Lc/b/k/n0;->w:Landroid/view/ViewGroup;

    sget v4, Lc/b/f;->action_mode_bar_stub:I

    .line 62
    invoke-virtual {v0, v4}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroidx/appcompat/widget/ViewStubCompat;

    if-eqz v0, :cond_6

    .line 63
    invoke-virtual {p0}, Lc/b/k/n0;->t()Landroid/content/Context;

    move-result-object v4

    invoke-static {v4}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v4

    invoke-virtual {v0, v4}, Landroidx/appcompat/widget/ViewStubCompat;->setLayoutInflater(Landroid/view/LayoutInflater;)V

    .line 64
    invoke-virtual {v0}, Landroidx/appcompat/widget/ViewStubCompat;->a()Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroidx/appcompat/widget/ActionBarContextView;

    iput-object v0, p0, Lc/b/k/n0;->q:Landroidx/appcompat/widget/ActionBarContextView;

    .line 65
    :cond_6
    :goto_2
    iget-object v0, p0, Lc/b/k/n0;->q:Landroidx/appcompat/widget/ActionBarContextView;

    if-eqz v0, :cond_b

    .line 66
    invoke-virtual {p0}, Lc/b/k/n0;->q()V

    .line 67
    iget-object v0, p0, Lc/b/k/n0;->q:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {v0}, Landroidx/appcompat/widget/ActionBarContextView;->d()V

    .line 68
    new-instance v0, Lc/b/p/f;

    iget-object v4, p0, Lc/b/k/n0;->q:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {v4}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v4

    iget-object v5, p0, Lc/b/k/n0;->q:Landroidx/appcompat/widget/ActionBarContextView;

    iget-object v6, p0, Lc/b/k/n0;->r:Landroid/widget/PopupWindow;

    if-nez v6, :cond_7

    goto :goto_3

    :cond_7
    const/4 v3, 0x0

    :goto_3
    invoke-direct {v0, v4, v5, p1, v3}, Lc/b/p/f;-><init>(Landroid/content/Context;Landroidx/appcompat/widget/ActionBarContextView;Lc/b/p/b;Z)V

    .line 69
    invoke-virtual {v0}, Lc/b/p/f;->c()Landroid/view/Menu;

    move-result-object v3

    invoke-interface {p1, v0, v3}, Lc/b/p/b;->b(Lc/b/p/c;Landroid/view/Menu;)Z

    move-result p1

    if-eqz p1, :cond_a

    .line 70
    invoke-virtual {v0}, Lc/b/p/f;->i()V

    .line 71
    iget-object p1, p0, Lc/b/k/n0;->q:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {p1, v0}, Landroidx/appcompat/widget/ActionBarContextView;->a(Lc/b/p/c;)V

    .line 72
    iput-object v0, p0, Lc/b/k/n0;->p:Lc/b/p/c;

    .line 73
    invoke-virtual {p0}, Lc/b/k/n0;->D()Z

    move-result p1

    const/high16 v0, 0x3f800000    # 1.0f

    if-eqz p1, :cond_8

    .line 74
    iget-object p1, p0, Lc/b/k/n0;->q:Landroidx/appcompat/widget/ActionBarContextView;

    const/4 v1, 0x0

    invoke-virtual {p1, v1}, Landroid/view/ViewGroup;->setAlpha(F)V

    .line 75
    iget-object p1, p0, Lc/b/k/n0;->q:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-static {p1}, Lc/h/n/v0;->a(Landroid/view/View;)Lc/h/n/c1;

    move-result-object p1

    invoke-virtual {p1, v0}, Lc/h/n/c1;->a(F)Lc/h/n/c1;

    iput-object p1, p0, Lc/b/k/n0;->t:Lc/h/n/c1;

    .line 76
    new-instance v0, Lc/b/k/b0;

    invoke-direct {v0, p0}, Lc/b/k/b0;-><init>(Lc/b/k/n0;)V

    invoke-virtual {p1, v0}, Lc/h/n/c1;->a(Lc/h/n/d1;)Lc/h/n/c1;

    goto :goto_4

    .line 77
    :cond_8
    iget-object p1, p0, Lc/b/k/n0;->q:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->setAlpha(F)V

    .line 78
    iget-object p1, p0, Lc/b/k/n0;->q:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {p1, v2}, Landroidx/appcompat/widget/ActionBarContextView;->setVisibility(I)V

    .line 79
    iget-object p1, p0, Lc/b/k/n0;->q:Landroidx/appcompat/widget/ActionBarContextView;

    const/16 v0, 0x20

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->sendAccessibilityEvent(I)V

    .line 80
    iget-object p1, p0, Lc/b/k/n0;->q:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getParent()Landroid/view/ViewParent;

    move-result-object p1

    instance-of p1, p1, Landroid/view/View;

    if-eqz p1, :cond_9

    .line 81
    iget-object p1, p0, Lc/b/k/n0;->q:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getParent()Landroid/view/ViewParent;

    move-result-object p1

    check-cast p1, Landroid/view/View;

    invoke-static {p1}, Lc/h/n/v0;->I(Landroid/view/View;)V

    .line 82
    :cond_9
    :goto_4
    iget-object p1, p0, Lc/b/k/n0;->r:Landroid/widget/PopupWindow;

    if-eqz p1, :cond_b

    .line 83
    iget-object p1, p0, Lc/b/k/n0;->g:Landroid/view/Window;

    invoke-virtual {p1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object p1

    iget-object v0, p0, Lc/b/k/n0;->s:Ljava/lang/Runnable;

    invoke-virtual {p1, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    goto :goto_5

    .line 84
    :cond_a
    iput-object v1, p0, Lc/b/k/n0;->p:Lc/b/p/c;

    .line 85
    :cond_b
    :goto_5
    iget-object p1, p0, Lc/b/k/n0;->p:Lc/b/p/c;

    if-eqz p1, :cond_c

    iget-object v0, p0, Lc/b/k/n0;->i:Lc/b/k/s;

    if-eqz v0, :cond_c

    .line 86
    invoke-interface {v0, p1}, Lc/b/k/s;->a(Lc/b/p/c;)V

    .line 87
    :cond_c
    iget-object p1, p0, Lc/b/k/n0;->p:Lc/b/p/c;

    return-object p1
.end method

.method public b(Landroid/os/Bundle;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lc/b/k/n0;->r()V

    return-void
.end method

.method public b(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 2

    .line 7
    invoke-virtual {p0}, Lc/b/k/n0;->r()V

    .line 8
    iget-object v0, p0, Lc/b/k/n0;->w:Landroid/view/ViewGroup;

    const v1, 0x1020002

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    .line 9
    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 10
    invoke-virtual {v0, p1, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 11
    iget-object p1, p0, Lc/b/k/n0;->h:Lc/b/k/f0;

    invoke-virtual {p1}, Lc/b/p/n;->a()Landroid/view/Window$Callback;

    move-result-object p1

    invoke-interface {p1}, Landroid/view/Window$Callback;->onContentChanged()V

    return-void
.end method

.method public b(Lc/b/p/o/m;)V
    .locals 2

    .line 131
    iget-boolean v0, p0, Lc/b/k/n0;->G:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    .line 132
    iput-boolean v0, p0, Lc/b/k/n0;->G:Z

    .line 133
    iget-object v0, p0, Lc/b/k/n0;->m:Lc/b/q/y0;

    invoke-interface {v0}, Lc/b/q/y0;->g()V

    .line 134
    invoke-virtual {p0}, Lc/b/k/n0;->x()Landroid/view/Window$Callback;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 135
    iget-boolean v1, p0, Lc/b/k/n0;->N:Z

    if-nez v1, :cond_1

    const/16 v1, 0x6c

    .line 136
    invoke-interface {v0, v1, p1}, Landroid/view/Window$Callback;->onPanelClosed(ILandroid/view/Menu;)V

    :cond_1
    const/4 p1, 0x0

    .line 137
    iput-boolean p1, p0, Lc/b/k/n0;->G:Z

    return-void
.end method

.method public b(I)Z
    .locals 4

    .line 12
    invoke-virtual {p0, p1}, Lc/b/k/n0;->k(I)I

    move-result p1

    .line 13
    iget-boolean v0, p0, Lc/b/k/n0;->F:Z

    const/4 v1, 0x0

    const/16 v2, 0x6c

    if-eqz v0, :cond_0

    if-ne p1, v2, :cond_0

    return v1

    .line 14
    :cond_0
    iget-boolean v0, p0, Lc/b/k/n0;->B:Z

    const/4 v3, 0x1

    if-eqz v0, :cond_1

    if-ne p1, v3, :cond_1

    .line 15
    iput-boolean v1, p0, Lc/b/k/n0;->B:Z

    :cond_1
    if-eq p1, v3, :cond_7

    const/4 v0, 0x2

    if-eq p1, v0, :cond_6

    const/4 v0, 0x5

    if-eq p1, v0, :cond_5

    const/16 v0, 0xa

    if-eq p1, v0, :cond_4

    if-eq p1, v2, :cond_3

    const/16 v0, 0x6d

    if-eq p1, v0, :cond_2

    .line 16
    iget-object v0, p0, Lc/b/k/n0;->g:Landroid/view/Window;

    invoke-virtual {v0, p1}, Landroid/view/Window;->requestFeature(I)Z

    move-result p1

    return p1

    .line 17
    :cond_2
    invoke-virtual {p0}, Lc/b/k/n0;->E()V

    .line 18
    iput-boolean v3, p0, Lc/b/k/n0;->C:Z

    return v3

    .line 19
    :cond_3
    invoke-virtual {p0}, Lc/b/k/n0;->E()V

    .line 20
    iput-boolean v3, p0, Lc/b/k/n0;->B:Z

    return v3

    .line 21
    :cond_4
    invoke-virtual {p0}, Lc/b/k/n0;->E()V

    .line 22
    iput-boolean v3, p0, Lc/b/k/n0;->D:Z

    return v3

    .line 23
    :cond_5
    invoke-virtual {p0}, Lc/b/k/n0;->E()V

    .line 24
    iput-boolean v3, p0, Lc/b/k/n0;->A:Z

    return v3

    .line 25
    :cond_6
    invoke-virtual {p0}, Lc/b/k/n0;->E()V

    .line 26
    iput-boolean v3, p0, Lc/b/k/n0;->z:Z

    return v3

    .line 27
    :cond_7
    invoke-virtual {p0}, Lc/b/k/n0;->E()V

    .line 28
    iput-boolean v3, p0, Lc/b/k/n0;->F:Z

    return v3
.end method

.method public final b(ILandroid/view/KeyEvent;)Z
    .locals 1

    .line 138
    invoke-virtual {p2}, Landroid/view/KeyEvent;->getRepeatCount()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    .line 139
    invoke-virtual {p0, p1, v0}, Lc/b/k/n0;->a(IZ)Lc/b/k/l0;

    move-result-object p1

    .line 140
    iget-boolean v0, p1, Lc/b/k/l0;->o:Z

    if-nez v0, :cond_0

    .line 141
    invoke-virtual {p0, p1, p2}, Lc/b/k/n0;->b(Lc/b/k/l0;Landroid/view/KeyEvent;)Z

    move-result p1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final b(IZ)Z
    .locals 8

    .line 142
    iget-object v0, p0, Lc/b/k/n0;->f:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    .line 143
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    iget v0, v0, Landroid/content/res/Configuration;->uiMode:I

    and-int/lit8 v0, v0, 0x30

    const/4 v1, 0x1

    if-eq p1, v1, :cond_1

    const/4 v2, 0x2

    if-eq p1, v2, :cond_0

    move v2, v0

    goto :goto_0

    :cond_0
    const/16 v2, 0x20

    goto :goto_0

    :cond_1
    const/16 v2, 0x10

    .line 144
    :goto_0
    invoke-virtual {p0}, Lc/b/k/n0;->z()Z

    move-result v3

    .line 145
    sget-boolean v4, Lc/b/k/n0;->f0:Z

    const/16 v5, 0x11

    const/4 v6, 0x0

    if-nez v4, :cond_2

    if-eq v2, v0, :cond_3

    :cond_2
    if-nez v3, :cond_3

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt v0, v5, :cond_3

    iget-boolean v0, p0, Lc/b/k/n0;->K:Z

    if-nez v0, :cond_3

    iget-object v0, p0, Lc/b/k/n0;->e:Ljava/lang/Object;

    instance-of v0, v0, Landroid/view/ContextThemeWrapper;

    if-eqz v0, :cond_3

    .line 146
    new-instance v0, Landroid/content/res/Configuration;

    invoke-direct {v0}, Landroid/content/res/Configuration;-><init>()V

    .line 147
    iget v4, v0, Landroid/content/res/Configuration;->uiMode:I

    and-int/lit8 v4, v4, -0x31

    or-int/2addr v4, v2

    iput v4, v0, Landroid/content/res/Configuration;->uiMode:I

    .line 148
    :try_start_0
    iget-object v4, p0, Lc/b/k/n0;->e:Ljava/lang/Object;

    check-cast v4, Landroid/view/ContextThemeWrapper;

    invoke-virtual {v4, v0}, Landroid/view/ContextThemeWrapper;->applyOverrideConfiguration(Landroid/content/res/Configuration;)V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v6, 0x1

    goto :goto_1

    :catch_0
    move-exception v0

    const-string v4, "AppCompatDelegate"

    const-string v7, "updateForNightMode. Calling applyOverrideConfiguration() failed with an exception. Will fall back to using Resources.updateConfiguration()"

    .line 149
    invoke-static {v4, v7, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 150
    :cond_3
    :goto_1
    iget-object v0, p0, Lc/b/k/n0;->f:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    iget v0, v0, Landroid/content/res/Configuration;->uiMode:I

    and-int/lit8 v0, v0, 0x30

    if-nez v6, :cond_5

    if-eq v0, v2, :cond_5

    if-eqz p2, :cond_5

    if-nez v3, :cond_5

    .line 151
    iget-boolean p2, p0, Lc/b/k/n0;->K:Z

    if-eqz p2, :cond_5

    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    if-ge p2, v5, :cond_4

    iget-boolean p2, p0, Lc/b/k/n0;->L:Z

    if-eqz p2, :cond_5

    :cond_4
    iget-object p2, p0, Lc/b/k/n0;->e:Ljava/lang/Object;

    instance-of v4, p2, Landroid/app/Activity;

    if-eqz v4, :cond_5

    .line 152
    check-cast p2, Landroid/app/Activity;

    invoke-static {p2}, Lc/h/e/f;->b(Landroid/app/Activity;)V

    const/4 v6, 0x1

    :cond_5
    if-nez v6, :cond_6

    if-eq v0, v2, :cond_6

    .line 153
    invoke-virtual {p0, v2, v3}, Lc/b/k/n0;->c(IZ)V

    goto :goto_2

    :cond_6
    move v1, v6

    :goto_2
    if-eqz v1, :cond_7

    .line 154
    iget-object p2, p0, Lc/b/k/n0;->e:Ljava/lang/Object;

    instance-of v0, p2, Lc/b/k/r;

    if-eqz v0, :cond_7

    .line 155
    check-cast p2, Lc/b/k/r;

    invoke-virtual {p2, p1}, Lc/b/k/r;->d(I)V

    :cond_7
    return v1
.end method

.method public final b(Lc/b/k/l0;)Z
    .locals 2

    .line 88
    invoke-virtual {p0}, Lc/b/k/n0;->t()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {p1, v0}, Lc/b/k/l0;->a(Landroid/content/Context;)V

    .line 89
    new-instance v0, Lc/b/k/k0;

    iget-object v1, p1, Lc/b/k/l0;->l:Landroid/content/Context;

    invoke-direct {v0, p0, v1}, Lc/b/k/k0;-><init>(Lc/b/k/n0;Landroid/content/Context;)V

    iput-object v0, p1, Lc/b/k/l0;->g:Landroid/view/ViewGroup;

    const/16 v0, 0x51

    .line 90
    iput v0, p1, Lc/b/k/l0;->c:I

    const/4 p1, 0x1

    return p1
.end method

.method public final b(Lc/b/k/l0;Landroid/view/KeyEvent;)Z
    .locals 8

    .line 91
    iget-boolean v0, p0, Lc/b/k/n0;->N:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return v1

    .line 92
    :cond_0
    iget-boolean v0, p1, Lc/b/k/l0;->m:Z

    const/4 v2, 0x1

    if-eqz v0, :cond_1

    return v2

    .line 93
    :cond_1
    iget-object v0, p0, Lc/b/k/n0;->I:Lc/b/k/l0;

    if-eqz v0, :cond_2

    if-eq v0, p1, :cond_2

    .line 94
    invoke-virtual {p0, v0, v1}, Lc/b/k/n0;->a(Lc/b/k/l0;Z)V

    .line 95
    :cond_2
    invoke-virtual {p0}, Lc/b/k/n0;->x()Landroid/view/Window$Callback;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 96
    iget v3, p1, Lc/b/k/l0;->a:I

    invoke-interface {v0, v3}, Landroid/view/Window$Callback;->onCreatePanelView(I)Landroid/view/View;

    move-result-object v3

    iput-object v3, p1, Lc/b/k/l0;->i:Landroid/view/View;

    .line 97
    :cond_3
    iget v3, p1, Lc/b/k/l0;->a:I

    if-eqz v3, :cond_5

    const/16 v4, 0x6c

    if-ne v3, v4, :cond_4

    goto :goto_0

    :cond_4
    const/4 v3, 0x0

    goto :goto_1

    :cond_5
    :goto_0
    const/4 v3, 0x1

    :goto_1
    if-eqz v3, :cond_6

    .line 98
    iget-object v4, p0, Lc/b/k/n0;->m:Lc/b/q/y0;

    if-eqz v4, :cond_6

    .line 99
    invoke-interface {v4}, Lc/b/q/y0;->e()V

    .line 100
    :cond_6
    iget-object v4, p1, Lc/b/k/l0;->i:Landroid/view/View;

    if-nez v4, :cond_15

    if-eqz v3, :cond_7

    .line 101
    invoke-virtual {p0}, Lc/b/k/n0;->C()Lc/b/k/a;

    move-result-object v4

    instance-of v4, v4, Lc/b/k/x0;

    if-nez v4, :cond_15

    .line 102
    :cond_7
    iget-object v4, p1, Lc/b/k/l0;->j:Lc/b/p/o/m;

    const/4 v5, 0x0

    if-eqz v4, :cond_8

    iget-boolean v4, p1, Lc/b/k/l0;->r:Z

    if-eqz v4, :cond_f

    .line 103
    :cond_8
    iget-object v4, p1, Lc/b/k/l0;->j:Lc/b/p/o/m;

    if-nez v4, :cond_a

    .line 104
    invoke-virtual {p0, p1}, Lc/b/k/n0;->c(Lc/b/k/l0;)Z

    move-result v4

    if-eqz v4, :cond_9

    iget-object v4, p1, Lc/b/k/l0;->j:Lc/b/p/o/m;

    if-nez v4, :cond_a

    :cond_9
    return v1

    :cond_a
    if-eqz v3, :cond_c

    .line 105
    iget-object v4, p0, Lc/b/k/n0;->m:Lc/b/q/y0;

    if-eqz v4, :cond_c

    .line 106
    iget-object v4, p0, Lc/b/k/n0;->n:Lc/b/k/c0;

    if-nez v4, :cond_b

    .line 107
    new-instance v4, Lc/b/k/c0;

    invoke-direct {v4, p0}, Lc/b/k/c0;-><init>(Lc/b/k/n0;)V

    iput-object v4, p0, Lc/b/k/n0;->n:Lc/b/k/c0;

    .line 108
    :cond_b
    iget-object v4, p0, Lc/b/k/n0;->m:Lc/b/q/y0;

    iget-object v6, p1, Lc/b/k/l0;->j:Lc/b/p/o/m;

    iget-object v7, p0, Lc/b/k/n0;->n:Lc/b/k/c0;

    invoke-interface {v4, v6, v7}, Lc/b/q/y0;->a(Landroid/view/Menu;Lc/b/p/o/z$a;)V

    .line 109
    :cond_c
    iget-object v4, p1, Lc/b/k/l0;->j:Lc/b/p/o/m;

    invoke-virtual {v4}, Lc/b/p/o/m;->s()V

    .line 110
    iget v4, p1, Lc/b/k/l0;->a:I

    iget-object v6, p1, Lc/b/k/l0;->j:Lc/b/p/o/m;

    invoke-interface {v0, v4, v6}, Landroid/view/Window$Callback;->onCreatePanelMenu(ILandroid/view/Menu;)Z

    move-result v4

    if-nez v4, :cond_e

    .line 111
    invoke-virtual {p1, v5}, Lc/b/k/l0;->a(Lc/b/p/o/m;)V

    if-eqz v3, :cond_d

    .line 112
    iget-object p1, p0, Lc/b/k/n0;->m:Lc/b/q/y0;

    if-eqz p1, :cond_d

    .line 113
    iget-object p2, p0, Lc/b/k/n0;->n:Lc/b/k/c0;

    invoke-interface {p1, v5, p2}, Lc/b/q/y0;->a(Landroid/view/Menu;Lc/b/p/o/z$a;)V

    :cond_d
    return v1

    .line 114
    :cond_e
    iput-boolean v1, p1, Lc/b/k/l0;->r:Z

    .line 115
    :cond_f
    iget-object v4, p1, Lc/b/k/l0;->j:Lc/b/p/o/m;

    invoke-virtual {v4}, Lc/b/p/o/m;->s()V

    .line 116
    iget-object v4, p1, Lc/b/k/l0;->s:Landroid/os/Bundle;

    if-eqz v4, :cond_10

    .line 117
    iget-object v6, p1, Lc/b/k/l0;->j:Lc/b/p/o/m;

    invoke-virtual {v6, v4}, Lc/b/p/o/m;->a(Landroid/os/Bundle;)V

    .line 118
    iput-object v5, p1, Lc/b/k/l0;->s:Landroid/os/Bundle;

    .line 119
    :cond_10
    iget-object v4, p1, Lc/b/k/l0;->i:Landroid/view/View;

    iget-object v6, p1, Lc/b/k/l0;->j:Lc/b/p/o/m;

    invoke-interface {v0, v1, v4, v6}, Landroid/view/Window$Callback;->onPreparePanel(ILandroid/view/View;Landroid/view/Menu;)Z

    move-result v0

    if-nez v0, :cond_12

    if-eqz v3, :cond_11

    .line 120
    iget-object p2, p0, Lc/b/k/n0;->m:Lc/b/q/y0;

    if-eqz p2, :cond_11

    .line 121
    iget-object v0, p0, Lc/b/k/n0;->n:Lc/b/k/c0;

    invoke-interface {p2, v5, v0}, Lc/b/q/y0;->a(Landroid/view/Menu;Lc/b/p/o/z$a;)V

    .line 122
    :cond_11
    iget-object p1, p1, Lc/b/k/l0;->j:Lc/b/p/o/m;

    invoke-virtual {p1}, Lc/b/p/o/m;->r()V

    return v1

    :cond_12
    if-eqz p2, :cond_13

    .line 123
    invoke-virtual {p2}, Landroid/view/KeyEvent;->getDeviceId()I

    move-result p2

    goto :goto_2

    :cond_13
    const/4 p2, -0x1

    .line 124
    :goto_2
    invoke-static {p2}, Landroid/view/KeyCharacterMap;->load(I)Landroid/view/KeyCharacterMap;

    move-result-object p2

    .line 125
    invoke-virtual {p2}, Landroid/view/KeyCharacterMap;->getKeyboardType()I

    move-result p2

    if-eq p2, v2, :cond_14

    const/4 p2, 0x1

    goto :goto_3

    :cond_14
    const/4 p2, 0x0

    :goto_3
    iput-boolean p2, p1, Lc/b/k/l0;->p:Z

    .line 126
    iget-object v0, p1, Lc/b/k/l0;->j:Lc/b/p/o/m;

    invoke-virtual {v0, p2}, Lc/b/p/o/m;->setQwertyMode(Z)V

    .line 127
    iget-object p2, p1, Lc/b/k/l0;->j:Lc/b/p/o/m;

    invoke-virtual {p2}, Lc/b/p/o/m;->r()V

    .line 128
    :cond_15
    iput-boolean v2, p1, Lc/b/k/l0;->m:Z

    .line 129
    iput-boolean v1, p1, Lc/b/k/l0;->n:Z

    .line 130
    iput-object p1, p0, Lc/b/k/n0;->I:Lc/b/k/l0;

    return v2
.end method

.method public c()Lc/b/k/a;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lc/b/k/n0;->y()V

    .line 2
    iget-object v0, p0, Lc/b/k/n0;->j:Lc/b/k/a;

    return-object v0
.end method

.method public c(I)V
    .locals 2

    .line 3
    invoke-virtual {p0}, Lc/b/k/n0;->r()V

    .line 4
    iget-object v0, p0, Lc/b/k/n0;->w:Landroid/view/ViewGroup;

    const v1, 0x1020002

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    .line 5
    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 6
    iget-object v1, p0, Lc/b/k/n0;->f:Landroid/content/Context;

    invoke-static {v1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v1

    invoke-virtual {v1, p1, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 7
    iget-object p1, p0, Lc/b/k/n0;->h:Lc/b/k/f0;

    invoke-virtual {p1}, Lc/b/p/n;->a()Landroid/view/Window$Callback;

    move-result-object p1

    invoke-interface {p1}, Landroid/view/Window$Callback;->onContentChanged()V

    return-void
.end method

.method public final c(IZ)V
    .locals 3

    .line 41
    iget-object v0, p0, Lc/b/k/n0;->f:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    .line 42
    new-instance v1, Landroid/content/res/Configuration;

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v2

    invoke-direct {v1, v2}, Landroid/content/res/Configuration;-><init>(Landroid/content/res/Configuration;)V

    .line 43
    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v2

    iget v2, v2, Landroid/content/res/Configuration;->uiMode:I

    and-int/lit8 v2, v2, -0x31

    or-int/2addr p1, v2

    iput p1, v1, Landroid/content/res/Configuration;->uiMode:I

    const/4 p1, 0x0

    .line 44
    invoke-virtual {v0, v1, p1}, Landroid/content/res/Resources;->updateConfiguration(Landroid/content/res/Configuration;Landroid/util/DisplayMetrics;)V

    .line 45
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x1a

    if-ge p1, v2, :cond_0

    .line 46
    invoke-static {v0}, Lc/b/k/r0;->a(Landroid/content/res/Resources;)V

    .line 47
    :cond_0
    iget p1, p0, Lc/b/k/n0;->P:I

    if-eqz p1, :cond_1

    .line 48
    iget-object v0, p0, Lc/b/k/n0;->f:Landroid/content/Context;

    invoke-virtual {v0, p1}, Landroid/content/Context;->setTheme(I)V

    .line 49
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v0, 0x17

    if-lt p1, v0, :cond_1

    .line 50
    iget-object p1, p0, Lc/b/k/n0;->f:Landroid/content/Context;

    invoke-virtual {p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object p1

    iget v0, p0, Lc/b/k/n0;->P:I

    const/4 v2, 0x1

    invoke-virtual {p1, v0, v2}, Landroid/content/res/Resources$Theme;->applyStyle(IZ)V

    :cond_1
    if-eqz p2, :cond_3

    .line 51
    iget-object p1, p0, Lc/b/k/n0;->e:Ljava/lang/Object;

    instance-of p2, p1, Landroid/app/Activity;

    if-eqz p2, :cond_3

    .line 52
    check-cast p1, Landroid/app/Activity;

    .line 53
    instance-of p2, p1, Lc/n/j;

    if-eqz p2, :cond_2

    .line 54
    move-object p2, p1

    check-cast p2, Lc/n/j;

    invoke-interface {p2}, Lc/n/j;->g()Lc/n/g;

    move-result-object p2

    .line 55
    invoke-virtual {p2}, Lc/n/g;->a()Lc/n/g$b;

    move-result-object p2

    sget-object v0, Lc/n/g$b;->e:Lc/n/g$b;

    invoke-virtual {p2, v0}, Lc/n/g$b;->a(Lc/n/g$b;)Z

    move-result p2

    if-eqz p2, :cond_3

    .line 56
    invoke-virtual {p1, v1}, Landroid/app/Activity;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    goto :goto_0

    .line 57
    :cond_2
    iget-boolean p2, p0, Lc/b/k/n0;->M:Z

    if-eqz p2, :cond_3

    .line 58
    invoke-virtual {p1, v1}, Landroid/app/Activity;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    :cond_3
    :goto_0
    return-void
.end method

.method public c(Landroid/os/Bundle;)V
    .locals 2

    .line 8
    iget p1, p0, Lc/b/k/n0;->O:I

    const/16 v0, -0x64

    if-eq p1, v0, :cond_0

    .line 9
    sget-object p1, Lc/b/k/n0;->b0:Ljava/util/Map;

    iget-object v0, p0, Lc/b/k/n0;->e:Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    iget v1, p0, Lc/b/k/n0;->O:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p1, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method public c(ILandroid/view/KeyEvent;)Z
    .locals 3

    .line 10
    invoke-virtual {p0}, Lc/b/k/n0;->c()Lc/b/k/a;

    move-result-object v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    .line 11
    invoke-virtual {v0, p1, p2}, Lc/b/k/a;->a(ILandroid/view/KeyEvent;)Z

    move-result p1

    if-eqz p1, :cond_0

    return v1

    .line 12
    :cond_0
    iget-object p1, p0, Lc/b/k/n0;->I:Lc/b/k/l0;

    if-eqz p1, :cond_2

    .line 13
    invoke-virtual {p2}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result v0

    invoke-virtual {p0, p1, v0, p2, v1}, Lc/b/k/n0;->a(Lc/b/k/l0;ILandroid/view/KeyEvent;I)Z

    move-result p1

    if-eqz p1, :cond_2

    .line 14
    iget-object p1, p0, Lc/b/k/n0;->I:Lc/b/k/l0;

    if-eqz p1, :cond_1

    .line 15
    iput-boolean v1, p1, Lc/b/k/l0;->n:Z

    :cond_1
    return v1

    .line 16
    :cond_2
    iget-object p1, p0, Lc/b/k/n0;->I:Lc/b/k/l0;

    const/4 v0, 0x0

    if-nez p1, :cond_3

    .line 17
    invoke-virtual {p0, v0, v1}, Lc/b/k/n0;->a(IZ)Lc/b/k/l0;

    move-result-object p1

    .line 18
    invoke-virtual {p0, p1, p2}, Lc/b/k/n0;->b(Lc/b/k/l0;Landroid/view/KeyEvent;)Z

    .line 19
    invoke-virtual {p2}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result v2

    invoke-virtual {p0, p1, v2, p2, v1}, Lc/b/k/n0;->a(Lc/b/k/l0;ILandroid/view/KeyEvent;I)Z

    move-result p2

    .line 20
    iput-boolean v0, p1, Lc/b/k/l0;->m:Z

    if-eqz p2, :cond_3

    return v1

    :cond_3
    return v0
.end method

.method public final c(Lc/b/k/l0;)Z
    .locals 6

    .line 21
    iget-object v0, p0, Lc/b/k/n0;->f:Landroid/content/Context;

    .line 22
    iget v1, p1, Lc/b/k/l0;->a:I

    const/4 v2, 0x1

    if-eqz v1, :cond_0

    const/16 v3, 0x6c

    if-ne v1, v3, :cond_4

    :cond_0
    iget-object v1, p0, Lc/b/k/n0;->m:Lc/b/q/y0;

    if-eqz v1, :cond_4

    .line 23
    new-instance v1, Landroid/util/TypedValue;

    invoke-direct {v1}, Landroid/util/TypedValue;-><init>()V

    .line 24
    invoke-virtual {v0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v3

    .line 25
    sget v4, Lc/b/a;->actionBarTheme:I

    invoke-virtual {v3, v4, v1, v2}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    const/4 v4, 0x0

    .line 26
    iget v5, v1, Landroid/util/TypedValue;->resourceId:I

    if-eqz v5, :cond_1

    .line 27
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    invoke-virtual {v4}, Landroid/content/res/Resources;->newTheme()Landroid/content/res/Resources$Theme;

    move-result-object v4

    .line 28
    invoke-virtual {v4, v3}, Landroid/content/res/Resources$Theme;->setTo(Landroid/content/res/Resources$Theme;)V

    .line 29
    iget v5, v1, Landroid/util/TypedValue;->resourceId:I

    invoke-virtual {v4, v5, v2}, Landroid/content/res/Resources$Theme;->applyStyle(IZ)V

    .line 30
    sget v5, Lc/b/a;->actionBarWidgetTheme:I

    invoke-virtual {v4, v5, v1, v2}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    goto :goto_0

    .line 31
    :cond_1
    sget v5, Lc/b/a;->actionBarWidgetTheme:I

    invoke-virtual {v3, v5, v1, v2}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    .line 32
    :goto_0
    iget v5, v1, Landroid/util/TypedValue;->resourceId:I

    if-eqz v5, :cond_3

    if-nez v4, :cond_2

    .line 33
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    invoke-virtual {v4}, Landroid/content/res/Resources;->newTheme()Landroid/content/res/Resources$Theme;

    move-result-object v4

    .line 34
    invoke-virtual {v4, v3}, Landroid/content/res/Resources$Theme;->setTo(Landroid/content/res/Resources$Theme;)V

    .line 35
    :cond_2
    iget v1, v1, Landroid/util/TypedValue;->resourceId:I

    invoke-virtual {v4, v1, v2}, Landroid/content/res/Resources$Theme;->applyStyle(IZ)V

    :cond_3
    if-eqz v4, :cond_4

    .line 36
    new-instance v1, Lc/b/p/e;

    const/4 v3, 0x0

    invoke-direct {v1, v0, v3}, Lc/b/p/e;-><init>(Landroid/content/Context;I)V

    .line 37
    invoke-virtual {v1}, Lc/b/p/e;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/content/res/Resources$Theme;->setTo(Landroid/content/res/Resources$Theme;)V

    move-object v0, v1

    .line 38
    :cond_4
    new-instance v1, Lc/b/p/o/m;

    invoke-direct {v1, v0}, Lc/b/p/o/m;-><init>(Landroid/content/Context;)V

    .line 39
    invoke-virtual {v1, p0}, Lc/b/p/o/m;->a(Lc/b/p/o/m$a;)V

    .line 40
    invoke-virtual {p1, v1}, Lc/b/k/l0;->a(Lc/b/p/o/m;)V

    return v2
.end method

.method public d()V
    .locals 2

    .line 9
    iget-object v0, p0, Lc/b/k/n0;->f:Landroid/content/Context;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    .line 10
    invoke-virtual {v0}, Landroid/view/LayoutInflater;->getFactory()Landroid/view/LayoutInflater$Factory;

    move-result-object v1

    if-nez v1, :cond_0

    .line 11
    invoke-static {v0, p0}, Lc/h/n/l;->b(Landroid/view/LayoutInflater;Landroid/view/LayoutInflater$Factory2;)V

    goto :goto_0

    .line 12
    :cond_0
    invoke-virtual {v0}, Landroid/view/LayoutInflater;->getFactory2()Landroid/view/LayoutInflater$Factory2;

    move-result-object v0

    instance-of v0, v0, Lc/b/k/n0;

    if-nez v0, :cond_1

    const-string v0, "AppCompatDelegate"

    const-string v1, "The Activity\'s LayoutInflater already has a Factory installed so we can not install AppCompat\'s"

    .line 13
    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    :cond_1
    :goto_0
    return-void
.end method

.method public d(I)V
    .locals 0

    .line 1
    iput p1, p0, Lc/b/k/n0;->P:I

    return-void
.end method

.method public d(ILandroid/view/KeyEvent;)Z
    .locals 3

    const/4 v0, 0x4

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eq p1, v0, :cond_1

    const/16 v0, 0x52

    if-eq p1, v0, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    invoke-virtual {p0, v2, p2}, Lc/b/k/n0;->e(ILandroid/view/KeyEvent;)Z

    return v1

    .line 3
    :cond_1
    iget-boolean p1, p0, Lc/b/k/n0;->J:Z

    .line 4
    iput-boolean v2, p0, Lc/b/k/n0;->J:Z

    .line 5
    invoke-virtual {p0, v2, v2}, Lc/b/k/n0;->a(IZ)Lc/b/k/l0;

    move-result-object p2

    if-eqz p2, :cond_3

    .line 6
    iget-boolean v0, p2, Lc/b/k/l0;->o:Z

    if-eqz v0, :cond_3

    if-nez p1, :cond_2

    .line 7
    invoke-virtual {p0, p2, v1}, Lc/b/k/n0;->a(Lc/b/k/l0;Z)V

    :cond_2
    return v1

    .line 8
    :cond_3
    invoke-virtual {p0}, Lc/b/k/n0;->B()Z

    move-result p1

    if-eqz p1, :cond_4

    return v1

    :cond_4
    :goto_0
    return v2
.end method

.method public e()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lc/b/k/n0;->c()Lc/b/k/a;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Lc/b/k/a;->i()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    .line 3
    invoke-virtual {p0, v0}, Lc/b/k/n0;->g(I)V

    return-void
.end method

.method public e(I)V
    .locals 1

    const/4 v0, 0x1

    .line 4
    invoke-virtual {p0, p1, v0}, Lc/b/k/n0;->a(IZ)Lc/b/k/l0;

    move-result-object p1

    invoke-virtual {p0, p1, v0}, Lc/b/k/n0;->a(Lc/b/k/l0;Z)V

    return-void
.end method

.method public final e(ILandroid/view/KeyEvent;)Z
    .locals 3

    .line 5
    iget-object v0, p0, Lc/b/k/n0;->p:Lc/b/p/c;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x1

    .line 6
    invoke-virtual {p0, p1, v0}, Lc/b/k/n0;->a(IZ)Lc/b/k/l0;

    move-result-object v2

    if-nez p1, :cond_2

    .line 7
    iget-object p1, p0, Lc/b/k/n0;->m:Lc/b/q/y0;

    if-eqz p1, :cond_2

    .line 8
    invoke-interface {p1}, Lc/b/q/y0;->f()Z

    move-result p1

    if-eqz p1, :cond_2

    iget-object p1, p0, Lc/b/k/n0;->f:Landroid/content/Context;

    .line 9
    invoke-static {p1}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/ViewConfiguration;->hasPermanentMenuKey()Z

    move-result p1

    if-nez p1, :cond_2

    .line 10
    iget-object p1, p0, Lc/b/k/n0;->m:Lc/b/q/y0;

    invoke-interface {p1}, Lc/b/q/y0;->b()Z

    move-result p1

    if-nez p1, :cond_1

    .line 11
    iget-boolean p1, p0, Lc/b/k/n0;->N:Z

    if-nez p1, :cond_5

    invoke-virtual {p0, v2, p2}, Lc/b/k/n0;->b(Lc/b/k/l0;Landroid/view/KeyEvent;)Z

    move-result p1

    if-eqz p1, :cond_5

    .line 12
    iget-object p1, p0, Lc/b/k/n0;->m:Lc/b/q/y0;

    invoke-interface {p1}, Lc/b/q/y0;->d()Z

    move-result v0

    goto :goto_2

    .line 13
    :cond_1
    iget-object p1, p0, Lc/b/k/n0;->m:Lc/b/q/y0;

    invoke-interface {p1}, Lc/b/q/y0;->c()Z

    move-result v0

    goto :goto_2

    .line 14
    :cond_2
    iget-boolean p1, v2, Lc/b/k/l0;->o:Z

    if-nez p1, :cond_6

    iget-boolean p1, v2, Lc/b/k/l0;->n:Z

    if-eqz p1, :cond_3

    goto :goto_1

    .line 15
    :cond_3
    iget-boolean p1, v2, Lc/b/k/l0;->m:Z

    if-eqz p1, :cond_5

    .line 16
    iget-boolean p1, v2, Lc/b/k/l0;->r:Z

    if-eqz p1, :cond_4

    .line 17
    iput-boolean v1, v2, Lc/b/k/l0;->m:Z

    .line 18
    invoke-virtual {p0, v2, p2}, Lc/b/k/n0;->b(Lc/b/k/l0;Landroid/view/KeyEvent;)Z

    move-result p1

    goto :goto_0

    :cond_4
    const/4 p1, 0x1

    :goto_0
    if-eqz p1, :cond_5

    .line 19
    invoke-virtual {p0, v2, p2}, Lc/b/k/n0;->a(Lc/b/k/l0;Landroid/view/KeyEvent;)V

    goto :goto_2

    :cond_5
    const/4 v0, 0x0

    goto :goto_2

    .line 20
    :cond_6
    :goto_1
    iget-boolean p1, v2, Lc/b/k/l0;->o:Z

    .line 21
    invoke-virtual {p0, v2, v0}, Lc/b/k/n0;->a(Lc/b/k/l0;Z)V

    move v0, p1

    :goto_2
    if-eqz v0, :cond_8

    .line 22
    iget-object p1, p0, Lc/b/k/n0;->f:Landroid/content/Context;

    const-string p2, "audio"

    invoke-virtual {p1, p2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/media/AudioManager;

    if-eqz p1, :cond_7

    .line 23
    invoke-virtual {p1, v1}, Landroid/media/AudioManager;->playSoundEffect(I)V

    goto :goto_3

    :cond_7
    const-string p1, "AppCompatDelegate"

    const-string p2, "Couldn\'t get audio manager"

    .line 24
    invoke-static {p1, p2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    :cond_8
    :goto_3
    return v0
.end method

.method public f()V
    .locals 2

    .line 1
    invoke-static {p0}, Lc/b/k/t;->b(Lc/b/k/t;)V

    .line 2
    iget-boolean v0, p0, Lc/b/k/n0;->U:Z

    if-eqz v0, :cond_0

    .line 3
    iget-object v0, p0, Lc/b/k/n0;->g:Landroid/view/Window;

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    iget-object v1, p0, Lc/b/k/n0;->W:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    :cond_0
    const/4 v0, 0x0

    .line 4
    iput-boolean v0, p0, Lc/b/k/n0;->M:Z

    const/4 v0, 0x1

    .line 5
    iput-boolean v0, p0, Lc/b/k/n0;->N:Z

    .line 6
    iget-object v0, p0, Lc/b/k/n0;->j:Lc/b/k/a;

    if-eqz v0, :cond_1

    .line 7
    invoke-virtual {v0}, Lc/b/k/a;->j()V

    .line 8
    :cond_1
    invoke-virtual {p0}, Lc/b/k/n0;->n()V

    return-void
.end method

.method public f(I)V
    .locals 4

    const/4 v0, 0x1

    .line 9
    invoke-virtual {p0, p1, v0}, Lc/b/k/n0;->a(IZ)Lc/b/k/l0;

    move-result-object v1

    .line 10
    iget-object v2, v1, Lc/b/k/l0;->j:Lc/b/p/o/m;

    if-eqz v2, :cond_1

    .line 11
    new-instance v2, Landroid/os/Bundle;

    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    .line 12
    iget-object v3, v1, Lc/b/k/l0;->j:Lc/b/p/o/m;

    invoke-virtual {v3, v2}, Lc/b/p/o/m;->b(Landroid/os/Bundle;)V

    .line 13
    invoke-virtual {v2}, Landroid/os/Bundle;->size()I

    move-result v3

    if-lez v3, :cond_0

    .line 14
    iput-object v2, v1, Lc/b/k/l0;->s:Landroid/os/Bundle;

    .line 15
    :cond_0
    iget-object v2, v1, Lc/b/k/l0;->j:Lc/b/p/o/m;

    invoke-virtual {v2}, Lc/b/p/o/m;->s()V

    .line 16
    iget-object v2, v1, Lc/b/k/l0;->j:Lc/b/p/o/m;

    invoke-virtual {v2}, Lc/b/p/o/m;->clear()V

    .line 17
    :cond_1
    iput-boolean v0, v1, Lc/b/k/l0;->r:Z

    .line 18
    iput-boolean v0, v1, Lc/b/k/l0;->q:Z

    const/16 v0, 0x6c

    if-eq p1, v0, :cond_2

    if-nez p1, :cond_3

    .line 19
    :cond_2
    iget-object p1, p0, Lc/b/k/n0;->m:Lc/b/q/y0;

    if-eqz p1, :cond_3

    const/4 p1, 0x0

    .line 20
    invoke-virtual {p0, p1, p1}, Lc/b/k/n0;->a(IZ)Lc/b/k/l0;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 21
    iput-boolean p1, v0, Lc/b/k/l0;->m:Z

    const/4 p1, 0x0

    .line 22
    invoke-virtual {p0, v0, p1}, Lc/b/k/n0;->b(Lc/b/k/l0;Landroid/view/KeyEvent;)Z

    :cond_3
    return-void
.end method

.method public g()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lc/b/k/n0;->c()Lc/b/k/a;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v1, 0x1

    .line 2
    invoke-virtual {v0, v1}, Lc/b/k/a;->e(Z)V

    :cond_0
    return-void
.end method

.method public final g(I)V
    .locals 2

    .line 3
    iget v0, p0, Lc/b/k/n0;->V:I

    const/4 v1, 0x1

    shl-int p1, v1, p1

    or-int/2addr p1, v0

    iput p1, p0, Lc/b/k/n0;->V:I

    .line 4
    iget-boolean p1, p0, Lc/b/k/n0;->U:Z

    if-nez p1, :cond_0

    .line 5
    iget-object p1, p0, Lc/b/k/n0;->g:Landroid/view/Window;

    invoke-virtual {p1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object p1

    iget-object v0, p0, Lc/b/k/n0;->W:Ljava/lang/Runnable;

    invoke-static {p1, v0}, Lc/h/n/v0;->a(Landroid/view/View;Ljava/lang/Runnable;)V

    .line 6
    iput-boolean v1, p0, Lc/b/k/n0;->U:Z

    :cond_0
    return-void
.end method

.method public h(I)I
    .locals 2

    const/16 v0, -0x64

    const/4 v1, -0x1

    if-eq p1, v0, :cond_4

    if-eq p1, v1, :cond_3

    if-eqz p1, :cond_1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_3

    const/4 v0, 0x2

    if-eq p1, v0, :cond_3

    const/4 v0, 0x3

    if-ne p1, v0, :cond_0

    .line 4
    invoke-virtual {p0}, Lc/b/k/n0;->u()Lc/b/k/i0;

    move-result-object p1

    invoke-virtual {p1}, Lc/b/k/i0;->c()I

    move-result p1

    return p1

    .line 5
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 6
    :cond_1
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v0, 0x17

    if-lt p1, v0, :cond_2

    .line 7
    iget-object p1, p0, Lc/b/k/n0;->f:Landroid/content/Context;

    const-class v0, Landroid/app/UiModeManager;

    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/app/UiModeManager;

    .line 8
    invoke-virtual {p1}, Landroid/app/UiModeManager;->getNightMode()I

    move-result p1

    if-nez p1, :cond_2

    return v1

    .line 9
    :cond_2
    invoke-virtual {p0}, Lc/b/k/n0;->v()Lc/b/k/i0;

    move-result-object p1

    invoke-virtual {p1}, Lc/b/k/i0;->c()I

    move-result p1

    :cond_3
    return p1

    :cond_4
    return v1
.end method

.method public h()V
    .locals 1

    const/4 v0, 0x1

    .line 1
    iput-boolean v0, p0, Lc/b/k/n0;->M:Z

    .line 2
    invoke-virtual {p0}, Lc/b/k/n0;->k()Z

    .line 3
    invoke-static {p0}, Lc/b/k/t;->a(Lc/b/k/t;)V

    return-void
.end method

.method public i()V
    .locals 2

    const/4 v0, 0x0

    .line 1
    iput-boolean v0, p0, Lc/b/k/n0;->M:Z

    .line 2
    invoke-static {p0}, Lc/b/k/t;->b(Lc/b/k/t;)V

    .line 3
    invoke-virtual {p0}, Lc/b/k/n0;->c()Lc/b/k/a;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 4
    invoke-virtual {v1, v0}, Lc/b/k/a;->e(Z)V

    .line 5
    :cond_0
    iget-object v0, p0, Lc/b/k/n0;->e:Ljava/lang/Object;

    instance-of v0, v0, Landroid/app/Dialog;

    if-eqz v0, :cond_1

    .line 6
    invoke-virtual {p0}, Lc/b/k/n0;->n()V

    :cond_1
    return-void
.end method

.method public i(I)V
    .locals 1

    const/16 v0, 0x6c

    if-ne p1, v0, :cond_0

    .line 7
    invoke-virtual {p0}, Lc/b/k/n0;->c()Lc/b/k/a;

    move-result-object p1

    if-eqz p1, :cond_0

    const/4 v0, 0x1

    .line 8
    invoke-virtual {p1, v0}, Lc/b/k/a;->b(Z)V

    :cond_0
    return-void
.end method

.method public j(I)V
    .locals 2

    const/4 v0, 0x0

    const/16 v1, 0x6c

    if-ne p1, v1, :cond_0

    .line 1
    invoke-virtual {p0}, Lc/b/k/n0;->c()Lc/b/k/a;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 2
    invoke-virtual {p1, v0}, Lc/b/k/a;->b(Z)V

    goto :goto_0

    :cond_0
    if-nez p1, :cond_1

    const/4 v1, 0x1

    .line 3
    invoke-virtual {p0, p1, v1}, Lc/b/k/n0;->a(IZ)Lc/b/k/l0;

    move-result-object p1

    .line 4
    iget-boolean v1, p1, Lc/b/k/l0;->o:Z

    if-eqz v1, :cond_1

    .line 5
    invoke-virtual {p0, p1, v0}, Lc/b/k/n0;->a(Lc/b/k/l0;Z)V

    :cond_1
    :goto_0
    return-void
.end method

.method public final k(I)I
    .locals 2

    const-string v0, "AppCompatDelegate"

    const/16 v1, 0x8

    if-ne p1, v1, :cond_0

    const-string p1, "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature."

    .line 1
    invoke-static {v0, p1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    const/16 p1, 0x6c

    return p1

    :cond_0
    const/16 v1, 0x9

    if-ne p1, v1, :cond_1

    const-string p1, "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature."

    .line 2
    invoke-static {v0, p1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    const/16 p1, 0x6d

    :cond_1
    return p1
.end method

.method public k()Z
    .locals 1

    const/4 v0, 0x1

    .line 3
    invoke-virtual {p0, v0}, Lc/b/k/n0;->a(Z)Z

    move-result v0

    return v0
.end method

.method public l(I)I
    .locals 8

    .line 28
    iget-object v0, p0, Lc/b/k/n0;->q:Landroidx/appcompat/widget/ActionBarContextView;

    const/4 v1, 0x0

    if-eqz v0, :cond_9

    .line 29
    invoke-virtual {v0}, Landroid/view/ViewGroup;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    instance-of v0, v0, Landroid/view/ViewGroup$MarginLayoutParams;

    if-eqz v0, :cond_9

    .line 30
    iget-object v0, p0, Lc/b/k/n0;->q:Landroidx/appcompat/widget/ActionBarContextView;

    .line 31
    invoke-virtual {v0}, Landroid/view/ViewGroup;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 32
    iget-object v2, p0, Lc/b/k/n0;->q:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {v2}, Landroid/view/ViewGroup;->isShown()Z

    move-result v2

    const/4 v3, 0x1

    if-eqz v2, :cond_7

    .line 33
    iget-object v2, p0, Lc/b/k/n0;->Y:Landroid/graphics/Rect;

    if-nez v2, :cond_0

    .line 34
    new-instance v2, Landroid/graphics/Rect;

    invoke-direct {v2}, Landroid/graphics/Rect;-><init>()V

    iput-object v2, p0, Lc/b/k/n0;->Y:Landroid/graphics/Rect;

    .line 35
    new-instance v2, Landroid/graphics/Rect;

    invoke-direct {v2}, Landroid/graphics/Rect;-><init>()V

    iput-object v2, p0, Lc/b/k/n0;->Z:Landroid/graphics/Rect;

    .line 36
    :cond_0
    iget-object v2, p0, Lc/b/k/n0;->Y:Landroid/graphics/Rect;

    .line 37
    iget-object v4, p0, Lc/b/k/n0;->Z:Landroid/graphics/Rect;

    .line 38
    invoke-virtual {v2, v1, p1, v1, v1}, Landroid/graphics/Rect;->set(IIII)V

    .line 39
    iget-object v5, p0, Lc/b/k/n0;->w:Landroid/view/ViewGroup;

    invoke-static {v5, v2, v4}, Lc/b/q/v2;->a(Landroid/view/View;Landroid/graphics/Rect;Landroid/graphics/Rect;)V

    .line 40
    iget v2, v4, Landroid/graphics/Rect;->top:I

    if-nez v2, :cond_1

    move v2, p1

    goto :goto_0

    :cond_1
    const/4 v2, 0x0

    .line 41
    :goto_0
    iget v4, v0, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    if-eq v4, v2, :cond_4

    .line 42
    iput p1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 43
    iget-object v2, p0, Lc/b/k/n0;->y:Landroid/view/View;

    if-nez v2, :cond_2

    .line 44
    new-instance v2, Landroid/view/View;

    iget-object v4, p0, Lc/b/k/n0;->f:Landroid/content/Context;

    invoke-direct {v2, v4}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    iput-object v2, p0, Lc/b/k/n0;->y:Landroid/view/View;

    .line 45
    iget-object v4, p0, Lc/b/k/n0;->f:Landroid/content/Context;

    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    sget v5, Lc/b/c;->abc_input_method_navigation_guard:I

    .line 46
    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getColor(I)I

    move-result v4

    .line 47
    invoke-virtual {v2, v4}, Landroid/view/View;->setBackgroundColor(I)V

    .line 48
    iget-object v2, p0, Lc/b/k/n0;->w:Landroid/view/ViewGroup;

    iget-object v4, p0, Lc/b/k/n0;->y:Landroid/view/View;

    new-instance v5, Landroid/view/ViewGroup$LayoutParams;

    const/4 v6, -0x1

    invoke-direct {v5, v6, p1}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    invoke-virtual {v2, v4, v6, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    goto :goto_1

    .line 49
    :cond_2
    invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v2

    .line 50
    iget v4, v2, Landroid/view/ViewGroup$LayoutParams;->height:I

    if-eq v4, p1, :cond_3

    .line 51
    iput p1, v2, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 52
    iget-object v4, p0, Lc/b/k/n0;->y:Landroid/view/View;

    invoke-virtual {v4, v2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    :cond_3
    :goto_1
    const/4 v2, 0x1

    goto :goto_2

    :cond_4
    const/4 v2, 0x0

    .line 53
    :goto_2
    iget-object v4, p0, Lc/b/k/n0;->y:Landroid/view/View;

    if-eqz v4, :cond_5

    goto :goto_3

    :cond_5
    const/4 v3, 0x0

    .line 54
    :goto_3
    iget-boolean v4, p0, Lc/b/k/n0;->D:Z

    if-nez v4, :cond_6

    if-eqz v3, :cond_6

    const/4 p1, 0x0

    :cond_6
    move v7, v3

    move v3, v2

    move v2, v7

    goto :goto_4

    .line 55
    :cond_7
    iget v2, v0, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    if-eqz v2, :cond_8

    .line 56
    iput v1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    const/4 v2, 0x0

    goto :goto_4

    :cond_8
    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_4
    if-eqz v3, :cond_a

    .line 57
    iget-object v3, p0, Lc/b/k/n0;->q:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {v3, v0}, Landroid/view/ViewGroup;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    goto :goto_5

    :cond_9
    const/4 v2, 0x0

    .line 58
    :cond_a
    :goto_5
    iget-object v0, p0, Lc/b/k/n0;->y:Landroid/view/View;

    if-eqz v0, :cond_c

    if-eqz v2, :cond_b

    goto :goto_6

    :cond_b
    const/16 v1, 0x8

    .line 59
    :goto_6
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    :cond_c
    return p1
.end method

.method public final l()V
    .locals 5

    .line 1
    iget-object v0, p0, Lc/b/k/n0;->w:Landroid/view/ViewGroup;

    const v1, 0x1020002

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroidx/appcompat/widget/ContentFrameLayout;

    .line 2
    iget-object v1, p0, Lc/b/k/n0;->g:Landroid/view/Window;

    invoke-virtual {v1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v1

    .line 3
    invoke-virtual {v1}, Landroid/view/View;->getPaddingLeft()I

    move-result v2

    .line 4
    invoke-virtual {v1}, Landroid/view/View;->getPaddingTop()I

    move-result v3

    invoke-virtual {v1}, Landroid/view/View;->getPaddingRight()I

    move-result v4

    .line 5
    invoke-virtual {v1}, Landroid/view/View;->getPaddingBottom()I

    move-result v1

    .line 6
    invoke-virtual {v0, v2, v3, v4, v1}, Landroidx/appcompat/widget/ContentFrameLayout;->a(IIII)V

    .line 7
    iget-object v1, p0, Lc/b/k/n0;->f:Landroid/content/Context;

    sget-object v2, Lc/b/j;->AppCompatTheme:[I

    invoke-virtual {v1, v2}, Landroid/content/Context;->obtainStyledAttributes([I)Landroid/content/res/TypedArray;

    move-result-object v1

    .line 8
    sget v2, Lc/b/j;->AppCompatTheme_windowMinWidthMajor:I

    invoke-virtual {v0}, Landroidx/appcompat/widget/ContentFrameLayout;->getMinWidthMajor()Landroid/util/TypedValue;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Landroid/content/res/TypedArray;->getValue(ILandroid/util/TypedValue;)Z

    .line 9
    sget v2, Lc/b/j;->AppCompatTheme_windowMinWidthMinor:I

    invoke-virtual {v0}, Landroidx/appcompat/widget/ContentFrameLayout;->getMinWidthMinor()Landroid/util/TypedValue;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Landroid/content/res/TypedArray;->getValue(ILandroid/util/TypedValue;)Z

    .line 10
    sget v2, Lc/b/j;->AppCompatTheme_windowFixedWidthMajor:I

    invoke-virtual {v1, v2}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 11
    sget v2, Lc/b/j;->AppCompatTheme_windowFixedWidthMajor:I

    .line 12
    invoke-virtual {v0}, Landroidx/appcompat/widget/ContentFrameLayout;->getFixedWidthMajor()Landroid/util/TypedValue;

    move-result-object v3

    .line 13
    invoke-virtual {v1, v2, v3}, Landroid/content/res/TypedArray;->getValue(ILandroid/util/TypedValue;)Z

    .line 14
    :cond_0
    sget v2, Lc/b/j;->AppCompatTheme_windowFixedWidthMinor:I

    invoke-virtual {v1, v2}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 15
    sget v2, Lc/b/j;->AppCompatTheme_windowFixedWidthMinor:I

    .line 16
    invoke-virtual {v0}, Landroidx/appcompat/widget/ContentFrameLayout;->getFixedWidthMinor()Landroid/util/TypedValue;

    move-result-object v3

    .line 17
    invoke-virtual {v1, v2, v3}, Landroid/content/res/TypedArray;->getValue(ILandroid/util/TypedValue;)Z

    .line 18
    :cond_1
    sget v2, Lc/b/j;->AppCompatTheme_windowFixedHeightMajor:I

    invoke-virtual {v1, v2}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 19
    sget v2, Lc/b/j;->AppCompatTheme_windowFixedHeightMajor:I

    .line 20
    invoke-virtual {v0}, Landroidx/appcompat/widget/ContentFrameLayout;->getFixedHeightMajor()Landroid/util/TypedValue;

    move-result-object v3

    .line 21
    invoke-virtual {v1, v2, v3}, Landroid/content/res/TypedArray;->getValue(ILandroid/util/TypedValue;)Z

    .line 22
    :cond_2
    sget v2, Lc/b/j;->AppCompatTheme_windowFixedHeightMinor:I

    invoke-virtual {v1, v2}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v2

    if-eqz v2, :cond_3

    .line 23
    sget v2, Lc/b/j;->AppCompatTheme_windowFixedHeightMinor:I

    .line 24
    invoke-virtual {v0}, Landroidx/appcompat/widget/ContentFrameLayout;->getFixedHeightMinor()Landroid/util/TypedValue;

    move-result-object v3

    .line 25
    invoke-virtual {v1, v2, v3}, Landroid/content/res/TypedArray;->getValue(ILandroid/util/TypedValue;)Z

    .line 26
    :cond_3
    invoke-virtual {v1}, Landroid/content/res/TypedArray;->recycle()V

    .line 27
    invoke-virtual {v0}, Landroid/widget/FrameLayout;->requestLayout()V

    return-void
.end method

.method public final m()I
    .locals 2

    .line 1
    iget v0, p0, Lc/b/k/n0;->O:I

    const/16 v1, -0x64

    if-eq v0, v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {}, Lc/b/k/t;->j()I

    move-result v0

    :goto_0
    return v0
.end method

.method public final n()V
    .locals 1

    .line 1
    iget-object v0, p0, Lc/b/k/n0;->S:Lc/b/k/i0;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Lc/b/k/i0;->a()V

    .line 3
    :cond_0
    iget-object v0, p0, Lc/b/k/n0;->T:Lc/b/k/i0;

    if-eqz v0, :cond_1

    .line 4
    invoke-virtual {v0}, Lc/b/k/i0;->a()V

    :cond_1
    return-void
.end method

.method public final o()Landroid/view/ViewGroup;
    .locals 7

    .line 1
    iget-object v0, p0, Lc/b/k/n0;->f:Landroid/content/Context;

    sget-object v1, Lc/b/j;->AppCompatTheme:[I

    invoke-virtual {v0, v1}, Landroid/content/Context;->obtainStyledAttributes([I)Landroid/content/res/TypedArray;

    move-result-object v0

    .line 2
    sget v1, Lc/b/j;->AppCompatTheme_windowActionBar:I

    invoke-virtual {v0, v1}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v1

    if-eqz v1, :cond_11

    .line 3
    sget v1, Lc/b/j;->AppCompatTheme_windowNoTitle:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v1

    const/4 v3, 0x1

    if-eqz v1, :cond_0

    .line 4
    invoke-virtual {p0, v3}, Lc/b/k/n0;->b(I)Z

    goto :goto_0

    .line 5
    :cond_0
    sget v1, Lc/b/j;->AppCompatTheme_windowActionBar:I

    invoke-virtual {v0, v1, v2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v1

    if-eqz v1, :cond_1

    const/16 v1, 0x6c

    .line 6
    invoke-virtual {p0, v1}, Lc/b/k/n0;->b(I)Z

    .line 7
    :cond_1
    :goto_0
    sget v1, Lc/b/j;->AppCompatTheme_windowActionBarOverlay:I

    invoke-virtual {v0, v1, v2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v1

    const/16 v4, 0x6d

    if-eqz v1, :cond_2

    .line 8
    invoke-virtual {p0, v4}, Lc/b/k/n0;->b(I)Z

    .line 9
    :cond_2
    sget v1, Lc/b/j;->AppCompatTheme_windowActionModeOverlay:I

    invoke-virtual {v0, v1, v2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v1

    if-eqz v1, :cond_3

    const/16 v1, 0xa

    .line 10
    invoke-virtual {p0, v1}, Lc/b/k/n0;->b(I)Z

    .line 11
    :cond_3
    sget v1, Lc/b/j;->AppCompatTheme_android_windowIsFloating:I

    invoke-virtual {v0, v1, v2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v1

    iput-boolean v1, p0, Lc/b/k/n0;->E:Z

    .line 12
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    .line 13
    invoke-virtual {p0}, Lc/b/k/n0;->s()V

    .line 14
    iget-object v0, p0, Lc/b/k/n0;->g:Landroid/view/Window;

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 15
    iget-object v0, p0, Lc/b/k/n0;->f:Landroid/content/Context;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    .line 16
    iget-boolean v1, p0, Lc/b/k/n0;->F:Z

    const/4 v5, 0x0

    if-nez v1, :cond_9

    .line 17
    iget-boolean v1, p0, Lc/b/k/n0;->E:Z

    if-eqz v1, :cond_4

    .line 18
    sget v1, Lc/b/g;->abc_dialog_title_material:I

    invoke-virtual {v0, v1, v5}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    .line 19
    iput-boolean v2, p0, Lc/b/k/n0;->C:Z

    iput-boolean v2, p0, Lc/b/k/n0;->B:Z

    goto/16 :goto_3

    .line 20
    :cond_4
    iget-boolean v0, p0, Lc/b/k/n0;->B:Z

    if-eqz v0, :cond_8

    .line 21
    new-instance v0, Landroid/util/TypedValue;

    invoke-direct {v0}, Landroid/util/TypedValue;-><init>()V

    .line 22
    iget-object v1, p0, Lc/b/k/n0;->f:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v1

    sget v6, Lc/b/a;->actionBarTheme:I

    invoke-virtual {v1, v6, v0, v3}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    .line 23
    iget v1, v0, Landroid/util/TypedValue;->resourceId:I

    if-eqz v1, :cond_5

    .line 24
    new-instance v1, Lc/b/p/e;

    iget-object v3, p0, Lc/b/k/n0;->f:Landroid/content/Context;

    iget v0, v0, Landroid/util/TypedValue;->resourceId:I

    invoke-direct {v1, v3, v0}, Lc/b/p/e;-><init>(Landroid/content/Context;I)V

    goto :goto_1

    .line 25
    :cond_5
    iget-object v1, p0, Lc/b/k/n0;->f:Landroid/content/Context;

    .line 26
    :goto_1
    invoke-static {v1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lc/b/g;->abc_screen_toolbar:I

    .line 27
    invoke-virtual {v0, v1, v5}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    .line 28
    sget v1, Lc/b/f;->decor_content_parent:I

    .line 29
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Lc/b/q/y0;

    iput-object v1, p0, Lc/b/k/n0;->m:Lc/b/q/y0;

    .line 30
    invoke-virtual {p0}, Lc/b/k/n0;->x()Landroid/view/Window$Callback;

    move-result-object v3

    invoke-interface {v1, v3}, Lc/b/q/y0;->setWindowCallback(Landroid/view/Window$Callback;)V

    .line 31
    iget-boolean v1, p0, Lc/b/k/n0;->C:Z

    if-eqz v1, :cond_6

    .line 32
    iget-object v1, p0, Lc/b/k/n0;->m:Lc/b/q/y0;

    invoke-interface {v1, v4}, Lc/b/q/y0;->a(I)V

    .line 33
    :cond_6
    iget-boolean v1, p0, Lc/b/k/n0;->z:Z

    if-eqz v1, :cond_7

    .line 34
    iget-object v1, p0, Lc/b/k/n0;->m:Lc/b/q/y0;

    const/4 v3, 0x2

    invoke-interface {v1, v3}, Lc/b/q/y0;->a(I)V

    .line 35
    :cond_7
    iget-boolean v1, p0, Lc/b/k/n0;->A:Z

    if-eqz v1, :cond_c

    .line 36
    iget-object v1, p0, Lc/b/k/n0;->m:Lc/b/q/y0;

    const/4 v3, 0x5

    invoke-interface {v1, v3}, Lc/b/q/y0;->a(I)V

    goto :goto_3

    :cond_8
    move-object v0, v5

    goto :goto_3

    .line 37
    :cond_9
    iget-boolean v1, p0, Lc/b/k/n0;->D:Z

    if-eqz v1, :cond_a

    .line 38
    sget v1, Lc/b/g;->abc_screen_simple_overlay_action_mode:I

    invoke-virtual {v0, v1, v5}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    goto :goto_2

    .line 39
    :cond_a
    sget v1, Lc/b/g;->abc_screen_simple:I

    invoke-virtual {v0, v1, v5}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    .line 40
    :goto_2
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x15

    if-lt v1, v3, :cond_b

    .line 41
    new-instance v1, Lc/b/k/w;

    invoke-direct {v1, p0}, Lc/b/k/w;-><init>(Lc/b/k/n0;)V

    invoke-static {v0, v1}, Lc/h/n/v0;->a(Landroid/view/View;Lc/h/n/x;)V

    goto :goto_3

    .line 42
    :cond_b
    move-object v1, v0

    check-cast v1, Lc/b/q/e1;

    new-instance v3, Lc/b/k/x;

    invoke-direct {v3, p0}, Lc/b/k/x;-><init>(Lc/b/k/n0;)V

    invoke-interface {v1, v3}, Lc/b/q/e1;->setOnFitSystemWindowsListener(Lc/b/q/e1$a;)V

    :cond_c
    :goto_3
    if-eqz v0, :cond_10

    .line 43
    iget-object v1, p0, Lc/b/k/n0;->m:Lc/b/q/y0;

    if-nez v1, :cond_d

    .line 44
    sget v1, Lc/b/f;->title:I

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    iput-object v1, p0, Lc/b/k/n0;->x:Landroid/widget/TextView;

    .line 45
    :cond_d
    invoke-static {v0}, Lc/b/q/v2;->b(Landroid/view/View;)V

    .line 46
    sget v1, Lc/b/f;->action_bar_activity_content:I

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroidx/appcompat/widget/ContentFrameLayout;

    .line 47
    iget-object v3, p0, Lc/b/k/n0;->g:Landroid/view/Window;

    const v4, 0x1020002

    invoke-virtual {v3, v4}, Landroid/view/Window;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/view/ViewGroup;

    if-eqz v3, :cond_f

    .line 48
    :goto_4
    invoke-virtual {v3}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v6

    if-lez v6, :cond_e

    .line 49
    invoke-virtual {v3, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v6

    .line 50
    invoke-virtual {v3, v2}, Landroid/view/ViewGroup;->removeViewAt(I)V

    .line 51
    invoke-virtual {v1, v6}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;)V

    goto :goto_4

    :cond_e
    const/4 v2, -0x1

    .line 52
    invoke-virtual {v3, v2}, Landroid/view/ViewGroup;->setId(I)V

    .line 53
    invoke-virtual {v1, v4}, Landroid/widget/FrameLayout;->setId(I)V

    .line 54
    instance-of v2, v3, Landroid/widget/FrameLayout;

    if-eqz v2, :cond_f

    .line 55
    check-cast v3, Landroid/widget/FrameLayout;

    invoke-virtual {v3, v5}, Landroid/widget/FrameLayout;->setForeground(Landroid/graphics/drawable/Drawable;)V

    .line 56
    :cond_f
    iget-object v2, p0, Lc/b/k/n0;->g:Landroid/view/Window;

    invoke-virtual {v2, v0}, Landroid/view/Window;->setContentView(Landroid/view/View;)V

    .line 57
    new-instance v2, Lc/b/k/y;

    invoke-direct {v2, p0}, Lc/b/k/y;-><init>(Lc/b/k/n0;)V

    invoke-virtual {v1, v2}, Landroidx/appcompat/widget/ContentFrameLayout;->setAttachListener(Landroidx/appcompat/widget/ContentFrameLayout$a;)V

    return-object v0

    .line 58
    :cond_10
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "AppCompat does not support the current theme features: { windowActionBar: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v2, p0, Lc/b/k/n0;->B:Z

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v2, ", windowActionBarOverlay: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v2, p0, Lc/b/k/n0;->C:Z

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v2, ", android:windowIsFloating: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v2, p0, Lc/b/k/n0;->E:Z

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v2, ", windowActionModeOverlay: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v2, p0, Lc/b/k/n0;->D:Z

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v2, ", windowNoTitle: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v2, p0, Lc/b/k/n0;->F:Z

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v2, " }"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 59
    :cond_11
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    .line 60
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "You need to use a Theme.AppCompat theme (or descendant) with this activity."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final onCreateView(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3, p4}, Lc/b/k/n0;->a(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public onCreateView(Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;
    .locals 1

    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0, p1, p2, p3}, Lc/b/k/n0;->onCreateView(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public p()V
    .locals 2

    .line 1
    iget-object v0, p0, Lc/b/k/n0;->m:Lc/b/q/y0;

    if-eqz v0, :cond_0

    .line 2
    invoke-interface {v0}, Lc/b/q/y0;->g()V

    .line 3
    :cond_0
    iget-object v0, p0, Lc/b/k/n0;->r:Landroid/widget/PopupWindow;

    if-eqz v0, :cond_2

    .line 4
    iget-object v0, p0, Lc/b/k/n0;->g:Landroid/view/Window;

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    iget-object v1, p0, Lc/b/k/n0;->s:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 5
    iget-object v0, p0, Lc/b/k/n0;->r:Landroid/widget/PopupWindow;

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 6
    :try_start_0
    iget-object v0, p0, Lc/b/k/n0;->r:Landroid/widget/PopupWindow;

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->dismiss()V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_1
    const/4 v0, 0x0

    .line 7
    iput-object v0, p0, Lc/b/k/n0;->r:Landroid/widget/PopupWindow;

    .line 8
    :cond_2
    invoke-virtual {p0}, Lc/b/k/n0;->q()V

    const/4 v0, 0x0

    .line 9
    invoke-virtual {p0, v0, v0}, Lc/b/k/n0;->a(IZ)Lc/b/k/l0;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 10
    iget-object v0, v0, Lc/b/k/l0;->j:Lc/b/p/o/m;

    if-eqz v0, :cond_3

    .line 11
    invoke-virtual {v0}, Lc/b/p/o/m;->close()V

    :cond_3
    return-void
.end method

.method public q()V
    .locals 1

    .line 1
    iget-object v0, p0, Lc/b/k/n0;->t:Lc/h/n/c1;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Lc/h/n/c1;->a()V

    :cond_0
    return-void
.end method

.method public final r()V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lc/b/k/n0;->v:Z

    if-nez v0, :cond_4

    .line 2
    invoke-virtual {p0}, Lc/b/k/n0;->o()Landroid/view/ViewGroup;

    move-result-object v0

    iput-object v0, p0, Lc/b/k/n0;->w:Landroid/view/ViewGroup;

    .line 3
    invoke-virtual {p0}, Lc/b/k/n0;->w()Ljava/lang/CharSequence;

    move-result-object v0

    .line 4
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_2

    .line 5
    iget-object v1, p0, Lc/b/k/n0;->m:Lc/b/q/y0;

    if-eqz v1, :cond_0

    .line 6
    invoke-interface {v1, v0}, Lc/b/q/y0;->setWindowTitle(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 7
    :cond_0
    invoke-virtual {p0}, Lc/b/k/n0;->C()Lc/b/k/a;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 8
    invoke-virtual {p0}, Lc/b/k/n0;->C()Lc/b/k/a;

    move-result-object v1

    invoke-virtual {v1, v0}, Lc/b/k/a;->b(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 9
    :cond_1
    iget-object v1, p0, Lc/b/k/n0;->x:Landroid/widget/TextView;

    if-eqz v1, :cond_2

    .line 10
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 11
    :cond_2
    :goto_0
    invoke-virtual {p0}, Lc/b/k/n0;->l()V

    .line 12
    iget-object v0, p0, Lc/b/k/n0;->w:Landroid/view/ViewGroup;

    invoke-virtual {p0, v0}, Lc/b/k/n0;->a(Landroid/view/ViewGroup;)V

    const/4 v0, 0x1

    .line 13
    iput-boolean v0, p0, Lc/b/k/n0;->v:Z

    const/4 v0, 0x0

    .line 14
    invoke-virtual {p0, v0, v0}, Lc/b/k/n0;->a(IZ)Lc/b/k/l0;

    move-result-object v0

    .line 15
    iget-boolean v1, p0, Lc/b/k/n0;->N:Z

    if-nez v1, :cond_4

    if-eqz v0, :cond_3

    iget-object v0, v0, Lc/b/k/l0;->j:Lc/b/p/o/m;

    if-nez v0, :cond_4

    :cond_3
    const/16 v0, 0x6c

    .line 16
    invoke-virtual {p0, v0}, Lc/b/k/n0;->g(I)V

    :cond_4
    return-void
.end method

.method public final s()V
    .locals 2

    .line 1
    iget-object v0, p0, Lc/b/k/n0;->g:Landroid/view/Window;

    if-nez v0, :cond_0

    iget-object v0, p0, Lc/b/k/n0;->e:Ljava/lang/Object;

    instance-of v1, v0, Landroid/app/Activity;

    if-eqz v1, :cond_0

    .line 2
    check-cast v0, Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {p0, v0}, Lc/b/k/n0;->a(Landroid/view/Window;)V

    .line 3
    :cond_0
    iget-object v0, p0, Lc/b/k/n0;->g:Landroid/view/Window;

    if-eqz v0, :cond_1

    return-void

    .line 4
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "We have not been given a Window"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final t()Landroid/content/Context;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lc/b/k/n0;->c()Lc/b/k/a;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Lc/b/k/a;->h()Landroid/content/Context;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_1

    .line 3
    iget-object v0, p0, Lc/b/k/n0;->f:Landroid/content/Context;

    :cond_1
    return-object v0
.end method

.method public final u()Lc/b/k/i0;
    .locals 2

    .line 1
    iget-object v0, p0, Lc/b/k/n0;->T:Lc/b/k/i0;

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Lc/b/k/g0;

    iget-object v1, p0, Lc/b/k/n0;->f:Landroid/content/Context;

    invoke-direct {v0, p0, v1}, Lc/b/k/g0;-><init>(Lc/b/k/n0;Landroid/content/Context;)V

    iput-object v0, p0, Lc/b/k/n0;->T:Lc/b/k/i0;

    .line 3
    :cond_0
    iget-object v0, p0, Lc/b/k/n0;->T:Lc/b/k/i0;

    return-object v0
.end method

.method public final v()Lc/b/k/i0;
    .locals 2

    .line 1
    iget-object v0, p0, Lc/b/k/n0;->S:Lc/b/k/i0;

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Lc/b/k/j0;

    iget-object v1, p0, Lc/b/k/n0;->f:Landroid/content/Context;

    .line 3
    invoke-static {v1}, Lc/b/k/a1;->a(Landroid/content/Context;)Lc/b/k/a1;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lc/b/k/j0;-><init>(Lc/b/k/n0;Lc/b/k/a1;)V

    iput-object v0, p0, Lc/b/k/n0;->S:Lc/b/k/i0;

    .line 4
    :cond_0
    iget-object v0, p0, Lc/b/k/n0;->S:Lc/b/k/i0;

    return-object v0
.end method

.method public final w()Ljava/lang/CharSequence;
    .locals 2

    .line 1
    iget-object v0, p0, Lc/b/k/n0;->e:Ljava/lang/Object;

    instance-of v1, v0, Landroid/app/Activity;

    if-eqz v1, :cond_0

    .line 2
    check-cast v0, Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getTitle()Ljava/lang/CharSequence;

    move-result-object v0

    return-object v0

    .line 3
    :cond_0
    iget-object v0, p0, Lc/b/k/n0;->l:Ljava/lang/CharSequence;

    return-object v0
.end method

.method public final x()Landroid/view/Window$Callback;
    .locals 1

    .line 1
    iget-object v0, p0, Lc/b/k/n0;->g:Landroid/view/Window;

    invoke-virtual {v0}, Landroid/view/Window;->getCallback()Landroid/view/Window$Callback;

    move-result-object v0

    return-object v0
.end method

.method public final y()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lc/b/k/n0;->r()V

    .line 2
    iget-boolean v0, p0, Lc/b/k/n0;->B:Z

    if-eqz v0, :cond_3

    iget-object v0, p0, Lc/b/k/n0;->j:Lc/b/k/a;

    if-eqz v0, :cond_0

    goto :goto_1

    .line 3
    :cond_0
    iget-object v0, p0, Lc/b/k/n0;->e:Ljava/lang/Object;

    instance-of v1, v0, Landroid/app/Activity;

    if-eqz v1, :cond_1

    .line 4
    new-instance v0, Lc/b/k/f1;

    iget-object v1, p0, Lc/b/k/n0;->e:Ljava/lang/Object;

    check-cast v1, Landroid/app/Activity;

    iget-boolean v2, p0, Lc/b/k/n0;->C:Z

    invoke-direct {v0, v1, v2}, Lc/b/k/f1;-><init>(Landroid/app/Activity;Z)V

    iput-object v0, p0, Lc/b/k/n0;->j:Lc/b/k/a;

    goto :goto_0

    .line 5
    :cond_1
    instance-of v0, v0, Landroid/app/Dialog;

    if-eqz v0, :cond_2

    .line 6
    new-instance v0, Lc/b/k/f1;

    iget-object v1, p0, Lc/b/k/n0;->e:Ljava/lang/Object;

    check-cast v1, Landroid/app/Dialog;

    invoke-direct {v0, v1}, Lc/b/k/f1;-><init>(Landroid/app/Dialog;)V

    iput-object v0, p0, Lc/b/k/n0;->j:Lc/b/k/a;

    .line 7
    :cond_2
    :goto_0
    iget-object v0, p0, Lc/b/k/n0;->j:Lc/b/k/a;

    if-eqz v0, :cond_3

    .line 8
    iget-boolean v1, p0, Lc/b/k/n0;->X:Z

    invoke-virtual {v0, v1}, Lc/b/k/a;->c(Z)V

    :cond_3
    :goto_1
    return-void
.end method

.method public final z()Z
    .locals 6

    .line 1
    iget-boolean v0, p0, Lc/b/k/n0;->R:Z

    const/4 v1, 0x1

    if-nez v0, :cond_2

    iget-object v0, p0, Lc/b/k/n0;->e:Ljava/lang/Object;

    instance-of v0, v0, Landroid/app/Activity;

    if-eqz v0, :cond_2

    .line 2
    iget-object v0, p0, Lc/b/k/n0;->f:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    const/4 v2, 0x0

    if-nez v0, :cond_0

    return v2

    .line 3
    :cond_0
    :try_start_0
    new-instance v3, Landroid/content/ComponentName;

    iget-object v4, p0, Lc/b/k/n0;->f:Landroid/content/Context;

    iget-object v5, p0, Lc/b/k/n0;->e:Ljava/lang/Object;

    .line 4
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v5

    invoke-direct {v3, v4, v5}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 5
    invoke-virtual {v0, v3, v2}, Landroid/content/pm/PackageManager;->getActivityInfo(Landroid/content/ComponentName;I)Landroid/content/pm/ActivityInfo;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 6
    iget v0, v0, Landroid/content/pm/ActivityInfo;->configChanges:I

    and-int/lit16 v0, v0, 0x200

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    iput-boolean v0, p0, Lc/b/k/n0;->Q:Z
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v0

    const-string v3, "AppCompatDelegate"

    const-string v4, "Exception while getting ActivityInfo"

    .line 7
    invoke-static {v3, v4, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 8
    iput-boolean v2, p0, Lc/b/k/n0;->Q:Z

    .line 9
    :cond_2
    :goto_1
    iput-boolean v1, p0, Lc/b/k/n0;->R:Z

    .line 10
    iget-boolean v0, p0, Lc/b/k/n0;->Q:Z

    return v0
.end method
