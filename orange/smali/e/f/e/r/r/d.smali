.class public final Le/f/e/r/r/d;
.super Le/f/e/r/r/b;
.source "SourceFile"


# instance fields
.field public final c:Le/f/e/r/r/c;

.field public d:I


# direct methods
.method public constructor <init>(IILe/f/e/r/r/c;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Le/f/e/r/r/b;-><init>(II)V

    .line 2
    iput-object p3, p0, Le/f/e/r/r/d;->c:Le/f/e/r/r/c;

    return-void
.end method


# virtual methods
.method public c()I
    .locals 1

    .line 1
    iget v0, p0, Le/f/e/r/r/d;->d:I

    return v0
.end method

.method public d()Le/f/e/r/r/c;
    .locals 1

    .line 1
    iget-object v0, p0, Le/f/e/r/r/d;->c:Le/f/e/r/r/c;

    return-object v0
.end method

.method public e()V
    .locals 1

    .line 1
    iget v0, p0, Le/f/e/r/r/d;->d:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Le/f/e/r/r/d;->d:I

    return-void
.end method
