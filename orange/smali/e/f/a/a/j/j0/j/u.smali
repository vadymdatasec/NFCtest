.class public final synthetic Le/f/a/a/j/j0/j/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final b:Le/f/a/a/j/j0/j/w;


# direct methods
.method public constructor <init>(Le/f/a/a/j/j0/j/w;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le/f/a/a/j/j0/j/u;->b:Le/f/a/a/j/j0/j/w;

    return-void
.end method

.method public static a(Le/f/a/a/j/j0/j/w;)Ljava/lang/Runnable;
    .locals 1

    new-instance v0, Le/f/a/a/j/j0/j/u;

    invoke-direct {v0, p0}, Le/f/a/a/j/j0/j/u;-><init>(Le/f/a/a/j/j0/j/w;)V

    return-object v0
.end method


# virtual methods
.method public run()V
    .locals 1

    iget-object v0, p0, Le/f/a/a/j/j0/j/u;->b:Le/f/a/a/j/j0/j/w;

    invoke-static {v0}, Le/f/a/a/j/j0/j/w;->b(Le/f/a/a/j/j0/j/w;)V

    return-void
.end method
