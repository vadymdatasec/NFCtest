.class public abstract Lc/w/a/a/s;
.super Lc/w/a/a/r;
.source "SourceFile"


# instance fields
.field public a:[Lc/h/g/d;

.field public b:Ljava/lang/String;

.field public c:I

.field public d:I


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, v0}, Lc/w/a/a/r;-><init>(Lc/w/a/a/n;)V

    .line 2
    iput-object v0, p0, Lc/w/a/a/s;->a:[Lc/h/g/d;

    const/4 v0, 0x0

    .line 3
    iput v0, p0, Lc/w/a/a/s;->c:I

    return-void
.end method

.method public constructor <init>(Lc/w/a/a/s;)V
    .locals 1

    const/4 v0, 0x0

    .line 4
    invoke-direct {p0, v0}, Lc/w/a/a/r;-><init>(Lc/w/a/a/n;)V

    .line 5
    iput-object v0, p0, Lc/w/a/a/s;->a:[Lc/h/g/d;

    const/4 v0, 0x0

    .line 6
    iput v0, p0, Lc/w/a/a/s;->c:I

    .line 7
    iget-object v0, p1, Lc/w/a/a/s;->b:Ljava/lang/String;

    iput-object v0, p0, Lc/w/a/a/s;->b:Ljava/lang/String;

    .line 8
    iget v0, p1, Lc/w/a/a/s;->d:I

    iput v0, p0, Lc/w/a/a/s;->d:I

    .line 9
    iget-object p1, p1, Lc/w/a/a/s;->a:[Lc/h/g/d;

    invoke-static {p1}, Lc/h/g/e;->a([Lc/h/g/d;)[Lc/h/g/d;

    move-result-object p1

    iput-object p1, p0, Lc/w/a/a/s;->a:[Lc/h/g/d;

    return-void
.end method


# virtual methods
.method public a(Landroid/graphics/Path;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Landroid/graphics/Path;->reset()V

    .line 2
    iget-object v0, p0, Lc/w/a/a/s;->a:[Lc/h/g/d;

    if-eqz v0, :cond_0

    .line 3
    invoke-static {v0, p1}, Lc/h/g/d;->a([Lc/h/g/d;Landroid/graphics/Path;)V

    :cond_0
    return-void
.end method

.method public b()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public getPathData()[Lc/h/g/d;
    .locals 1

    .line 1
    iget-object v0, p0, Lc/w/a/a/s;->a:[Lc/h/g/d;

    return-object v0
.end method

.method public getPathName()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lc/w/a/a/s;->b:Ljava/lang/String;

    return-object v0
.end method

.method public setPathData([Lc/h/g/d;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lc/w/a/a/s;->a:[Lc/h/g/d;

    invoke-static {v0, p1}, Lc/h/g/e;->a([Lc/h/g/d;[Lc/h/g/d;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 2
    invoke-static {p1}, Lc/h/g/e;->a([Lc/h/g/d;)[Lc/h/g/d;

    move-result-object p1

    iput-object p1, p0, Lc/w/a/a/s;->a:[Lc/h/g/d;

    goto :goto_0

    .line 3
    :cond_0
    iget-object v0, p0, Lc/w/a/a/s;->a:[Lc/h/g/d;

    invoke-static {v0, p1}, Lc/h/g/e;->b([Lc/h/g/d;[Lc/h/g/d;)V

    :goto_0
    return-void
.end method
