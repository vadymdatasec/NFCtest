.class public final synthetic Le/f/a/a/i/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le/f/a/a/j/i0/a;


# instance fields
.field public final a:Le/f/a/a/i/g;


# direct methods
.method public constructor <init>(Le/f/a/a/i/g;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le/f/a/a/i/c;->a:Le/f/a/a/i/g;

    return-void
.end method

.method public static a(Le/f/a/a/i/g;)Le/f/a/a/j/i0/a;
    .locals 1

    new-instance v0, Le/f/a/a/i/c;

    invoke-direct {v0, p0}, Le/f/a/a/i/c;-><init>(Le/f/a/a/i/g;)V

    return-object v0
.end method


# virtual methods
.method public a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Le/f/a/a/i/c;->a:Le/f/a/a/i/g;

    check-cast p1, Le/f/a/a/i/e;

    invoke-static {v0, p1}, Le/f/a/a/i/g;->a(Le/f/a/a/i/g;Le/f/a/a/i/e;)Le/f/a/a/i/f;

    move-result-object p1

    return-object p1
.end method
