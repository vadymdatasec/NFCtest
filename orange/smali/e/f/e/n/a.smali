.class public final Le/f/e/n/a;
.super Le/f/e/o/g;
.source "SourceFile"


# instance fields
.field public final c:Z

.field public final d:I

.field public final e:I


# direct methods
.method public constructor <init>(Le/f/e/o/b;[Le/f/e/l;ZII)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Le/f/e/o/g;-><init>(Le/f/e/o/b;[Le/f/e/l;)V

    .line 2
    iput-boolean p3, p0, Le/f/e/n/a;->c:Z

    .line 3
    iput p4, p0, Le/f/e/n/a;->d:I

    .line 4
    iput p5, p0, Le/f/e/n/a;->e:I

    return-void
.end method


# virtual methods
.method public c()I
    .locals 1

    .line 1
    iget v0, p0, Le/f/e/n/a;->d:I

    return v0
.end method

.method public d()I
    .locals 1

    .line 1
    iget v0, p0, Le/f/e/n/a;->e:I

    return v0
.end method

.method public e()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Le/f/e/n/a;->c:Z

    return v0
.end method
