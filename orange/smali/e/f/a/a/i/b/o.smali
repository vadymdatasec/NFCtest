.class public final Le/f/a/a/i/b/o;
.super Le/f/a/a/i/b/b0;
.source "SourceFile"


# instance fields
.field public a:Le/f/a/a/i/b/c0;

.field public b:Le/f/a/a/i/b/b;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Le/f/a/a/i/b/b0;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Le/f/a/a/i/b/b;)Le/f/a/a/i/b/b0;
    .locals 0

    .line 2
    iput-object p1, p0, Le/f/a/a/i/b/o;->b:Le/f/a/a/i/b/b;

    return-object p0
.end method

.method public a(Le/f/a/a/i/b/c0;)Le/f/a/a/i/b/b0;
    .locals 0

    .line 1
    iput-object p1, p0, Le/f/a/a/i/b/o;->a:Le/f/a/a/i/b/c0;

    return-object p0
.end method

.method public a()Le/f/a/a/i/b/d0;
    .locals 4

    .line 3
    new-instance v0, Le/f/a/a/i/b/p;

    iget-object v1, p0, Le/f/a/a/i/b/o;->a:Le/f/a/a/i/b/c0;

    iget-object v2, p0, Le/f/a/a/i/b/o;->b:Le/f/a/a/i/b/b;

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Le/f/a/a/i/b/p;-><init>(Le/f/a/a/i/b/c0;Le/f/a/a/i/b/b;Le/f/a/a/i/b/n;)V

    return-object v0
.end method
