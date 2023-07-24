.class public final Le/f/e/r/r/g/e/n;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:I

.field public b:Le/f/e/r/r/g/e/m;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput v0, p0, Le/f/e/r/r/g/e/n;->a:I

    .line 3
    sget-object v0, Le/f/e/r/r/g/e/m;->b:Le/f/e/r/r/g/e/m;

    iput-object v0, p0, Le/f/e/r/r/g/e/n;->b:Le/f/e/r/r/g/e/m;

    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    .line 1
    iget v0, p0, Le/f/e/r/r/g/e/n;->a:I

    return v0
.end method

.method public a(I)V
    .locals 1

    .line 2
    iget v0, p0, Le/f/e/r/r/g/e/n;->a:I

    add-int/2addr v0, p1

    iput v0, p0, Le/f/e/r/r/g/e/n;->a:I

    return-void
.end method

.method public b(I)V
    .locals 0

    .line 1
    iput p1, p0, Le/f/e/r/r/g/e/n;->a:I

    return-void
.end method

.method public b()Z
    .locals 2

    .line 2
    iget-object v0, p0, Le/f/e/r/r/g/e/n;->b:Le/f/e/r/r/g/e/m;

    sget-object v1, Le/f/e/r/r/g/e/m;->c:Le/f/e/r/r/g/e/m;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public c()Z
    .locals 2

    .line 1
    iget-object v0, p0, Le/f/e/r/r/g/e/n;->b:Le/f/e/r/r/g/e/m;

    sget-object v1, Le/f/e/r/r/g/e/m;->d:Le/f/e/r/r/g/e/m;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public d()V
    .locals 1

    .line 1
    sget-object v0, Le/f/e/r/r/g/e/m;->c:Le/f/e/r/r/g/e/m;

    iput-object v0, p0, Le/f/e/r/r/g/e/n;->b:Le/f/e/r/r/g/e/m;

    return-void
.end method

.method public e()V
    .locals 1

    .line 1
    sget-object v0, Le/f/e/r/r/g/e/m;->d:Le/f/e/r/r/g/e/m;

    iput-object v0, p0, Le/f/e/r/r/g/e/n;->b:Le/f/e/r/r/g/e/m;

    return-void
.end method

.method public f()V
    .locals 1

    .line 1
    sget-object v0, Le/f/e/r/r/g/e/m;->b:Le/f/e/r/r/g/e/m;

    iput-object v0, p0, Le/f/e/r/r/g/e/n;->b:Le/f/e/r/r/g/e/m;

    return-void
.end method
