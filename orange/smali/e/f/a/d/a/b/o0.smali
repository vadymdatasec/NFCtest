.class public final Le/f/a/d/a/b/o0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Le/f/a/d/a/b/a3;


# direct methods
.method public synthetic constructor <init>([B)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Le/f/a/d/a/b/d;
    .locals 2

    iget-object v0, p0, Le/f/a/d/a/b/o0;->a:Le/f/a/d/a/b/a3;

    const-class v1, Le/f/a/d/a/b/a3;

    invoke-static {v0, v1}, Le/f/a/d/a/e/m;->a(Ljava/lang/Object;Ljava/lang/Class;)V

    new-instance v0, Le/f/a/d/a/b/p0;

    iget-object v1, p0, Le/f/a/d/a/b/o0;->a:Le/f/a/d/a/b/a3;

    invoke-direct {v0, v1}, Le/f/a/d/a/b/p0;-><init>(Le/f/a/d/a/b/a3;)V

    return-object v0
.end method

.method public final a(Le/f/a/d/a/b/a3;)V
    .locals 0

    iput-object p1, p0, Le/f/a/d/a/b/o0;->a:Le/f/a/d/a/b/a3;

    return-void
.end method
