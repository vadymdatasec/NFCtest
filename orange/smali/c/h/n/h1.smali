.class public final Lc/h/n/h1;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lc/h/n/l1;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1e

    if-lt v0, v1, :cond_0

    .line 3
    new-instance v0, Lc/h/n/k1;

    invoke-direct {v0}, Lc/h/n/k1;-><init>()V

    iput-object v0, p0, Lc/h/n/h1;->a:Lc/h/n/l1;

    goto :goto_0

    :cond_0
    const/16 v1, 0x1d

    if-lt v0, v1, :cond_1

    .line 4
    new-instance v0, Lc/h/n/j1;

    invoke-direct {v0}, Lc/h/n/j1;-><init>()V

    iput-object v0, p0, Lc/h/n/h1;->a:Lc/h/n/l1;

    goto :goto_0

    :cond_1
    const/16 v1, 0x14

    if-lt v0, v1, :cond_2

    .line 5
    new-instance v0, Lc/h/n/i1;

    invoke-direct {v0}, Lc/h/n/i1;-><init>()V

    iput-object v0, p0, Lc/h/n/h1;->a:Lc/h/n/l1;

    goto :goto_0

    .line 6
    :cond_2
    new-instance v0, Lc/h/n/l1;

    invoke-direct {v0}, Lc/h/n/l1;-><init>()V

    iput-object v0, p0, Lc/h/n/h1;->a:Lc/h/n/l1;

    :goto_0
    return-void
.end method

.method public constructor <init>(Lc/h/n/u1;)V
    .locals 2

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1e

    if-lt v0, v1, :cond_0

    .line 9
    new-instance v0, Lc/h/n/k1;

    invoke-direct {v0, p1}, Lc/h/n/k1;-><init>(Lc/h/n/u1;)V

    iput-object v0, p0, Lc/h/n/h1;->a:Lc/h/n/l1;

    goto :goto_0

    :cond_0
    const/16 v1, 0x1d

    if-lt v0, v1, :cond_1

    .line 10
    new-instance v0, Lc/h/n/j1;

    invoke-direct {v0, p1}, Lc/h/n/j1;-><init>(Lc/h/n/u1;)V

    iput-object v0, p0, Lc/h/n/h1;->a:Lc/h/n/l1;

    goto :goto_0

    :cond_1
    const/16 v1, 0x14

    if-lt v0, v1, :cond_2

    .line 11
    new-instance v0, Lc/h/n/i1;

    invoke-direct {v0, p1}, Lc/h/n/i1;-><init>(Lc/h/n/u1;)V

    iput-object v0, p0, Lc/h/n/h1;->a:Lc/h/n/l1;

    goto :goto_0

    .line 12
    :cond_2
    new-instance v0, Lc/h/n/l1;

    invoke-direct {v0, p1}, Lc/h/n/l1;-><init>(Lc/h/n/u1;)V

    iput-object v0, p0, Lc/h/n/h1;->a:Lc/h/n/l1;

    :goto_0
    return-void
.end method


# virtual methods
.method public a(Lc/h/g/b;)Lc/h/n/h1;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    iget-object v0, p0, Lc/h/n/h1;->a:Lc/h/n/l1;

    invoke-virtual {v0, p1}, Lc/h/n/l1;->b(Lc/h/g/b;)V

    return-object p0
.end method

.method public a()Lc/h/n/u1;
    .locals 1

    .line 2
    iget-object v0, p0, Lc/h/n/h1;->a:Lc/h/n/l1;

    invoke-virtual {v0}, Lc/h/n/l1;->b()Lc/h/n/u1;

    move-result-object v0

    return-object v0
.end method

.method public b(Lc/h/g/b;)Lc/h/n/h1;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    iget-object v0, p0, Lc/h/n/h1;->a:Lc/h/n/l1;

    invoke-virtual {v0, p1}, Lc/h/n/l1;->d(Lc/h/g/b;)V

    return-object p0
.end method
