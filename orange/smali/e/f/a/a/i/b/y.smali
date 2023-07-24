.class public final Le/f/a/a/i/b/y;
.super Le/f/a/a/i/b/j0;
.source "SourceFile"


# instance fields
.field public a:Le/f/a/a/i/b/l0;

.field public b:Le/f/a/a/i/b/k0;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Le/f/a/a/i/b/j0;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Le/f/a/a/i/b/k0;)Le/f/a/a/i/b/j0;
    .locals 0

    .line 2
    iput-object p1, p0, Le/f/a/a/i/b/y;->b:Le/f/a/a/i/b/k0;

    return-object p0
.end method

.method public a(Le/f/a/a/i/b/l0;)Le/f/a/a/i/b/j0;
    .locals 0

    .line 1
    iput-object p1, p0, Le/f/a/a/i/b/y;->a:Le/f/a/a/i/b/l0;

    return-object p0
.end method

.method public a()Le/f/a/a/i/b/m0;
    .locals 4

    .line 3
    new-instance v0, Le/f/a/a/i/b/z;

    iget-object v1, p0, Le/f/a/a/i/b/y;->a:Le/f/a/a/i/b/l0;

    iget-object v2, p0, Le/f/a/a/i/b/y;->b:Le/f/a/a/i/b/k0;

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Le/f/a/a/i/b/z;-><init>(Le/f/a/a/i/b/l0;Le/f/a/a/i/b/k0;Le/f/a/a/i/b/x;)V

    return-object v0
.end method
