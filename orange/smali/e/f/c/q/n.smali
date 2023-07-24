.class public final synthetic Le/f/c/q/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le/f/a/b/h/a;


# instance fields
.field public final a:Le/f/c/q/o;


# direct methods
.method public constructor <init>(Le/f/c/q/o;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le/f/c/q/n;->a:Le/f/c/q/o;

    return-void
.end method


# virtual methods
.method public final a(Le/f/a/b/h/g;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Le/f/c/q/n;->a:Le/f/c/q/o;

    invoke-virtual {v0, p1}, Le/f/c/q/o;->b(Le/f/a/b/h/g;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
