.class public final synthetic Le/f/a/b/b/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final b:Le/f/a/b/b/l;


# direct methods
.method public constructor <init>(Le/f/a/b/b/l;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le/f/a/b/b/n;->b:Le/f/a/b/b/l;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Le/f/a/b/b/n;->b:Le/f/a/b/b/l;

    invoke-virtual {v0}, Le/f/a/b/b/l;->c()V

    return-void
.end method
