.class public final synthetic Le/f/c/q/e0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final b:Le/f/c/q/g0;


# direct methods
.method public constructor <init>(Le/f/c/q/g0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le/f/c/q/e0;->b:Le/f/c/q/g0;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Le/f/c/q/e0;->b:Le/f/c/q/g0;

    invoke-virtual {v0}, Le/f/c/q/g0;->c()V

    return-void
.end method
