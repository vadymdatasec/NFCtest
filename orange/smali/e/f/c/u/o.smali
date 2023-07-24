.class public final synthetic Le/f/c/u/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le/f/a/b/h/f;


# instance fields
.field public final a:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le/f/c/u/o;->a:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)Le/f/a/b/h/g;
    .locals 1

    iget-object v0, p0, Le/f/c/u/o;->a:Ljava/lang/String;

    check-cast p1, Le/f/c/u/i0;

    invoke-static {v0, p1}, Lcom/google/firebase/messaging/FirebaseMessaging;->b(Ljava/lang/String;Le/f/c/u/i0;)Le/f/a/b/h/g;

    move-result-object p1

    return-object p1
.end method
