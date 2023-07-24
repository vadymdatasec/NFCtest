.class public final synthetic Le/f/a/d/a/b/s2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final b:Le/f/a/d/a/b/v2;


# direct methods
.method public constructor <init>(Le/f/a/d/a/b/v2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le/f/a/d/a/b/s2;->b:Le/f/a/d/a/b/v2;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Le/f/a/d/a/b/s2;->b:Le/f/a/d/a/b/v2;

    invoke-virtual {v0}, Le/f/a/d/a/b/v2;->a()V

    return-void
.end method
