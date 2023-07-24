.class public final synthetic Le/f/a/d/a/b/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final b:Le/f/a/d/a/b/v;

.field public final c:Le/f/a/d/a/b/b;


# direct methods
.method public constructor <init>(Le/f/a/d/a/b/v;Le/f/a/d/a/b/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le/f/a/d/a/b/s;->b:Le/f/a/d/a/b/v;

    iput-object p2, p0, Le/f/a/d/a/b/s;->c:Le/f/a/d/a/b/b;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Le/f/a/d/a/b/s;->b:Le/f/a/d/a/b/v;

    iget-object v1, p0, Le/f/a/d/a/b/s;->c:Le/f/a/d/a/b/b;

    invoke-virtual {v0, v1}, Le/f/a/d/a/f/c;->a(Ljava/lang/Object;)V

    return-void
.end method
