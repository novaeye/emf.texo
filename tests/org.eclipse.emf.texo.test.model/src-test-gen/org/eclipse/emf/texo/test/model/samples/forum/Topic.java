package org.eclipse.emf.texo.test.model.samples.forum;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OrderColumn;

/** 
 * A representation of the model object '<em><b>Topic</b></em>'.
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * @generated 
 */
@Entity(name = "Topic")
public class Topic {

  /** 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated 
   */
  @Basic(optional = false)
  private String title = null;

  /** 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated 
   */
  @Basic(optional = false)
  private TopicCategory category = TopicCategory.ANNOUNCEMENT;

  /** 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated 
   */
  @ManyToOne(cascade = { CascadeType.ALL, CascadeType.PERSIST, CascadeType.REFRESH }, optional = false, targetEntity = Member.class)
  @JoinColumns({ @JoinColumn() })
  private Member creator = null;

  /** 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated 
   */
  @OneToMany(cascade = { CascadeType.ALL, CascadeType.PERSIST, CascadeType.REFRESH }, targetEntity = Post.class)
  @OrderColumn()
  @JoinTable(name = "Topic_posts")
  private List<Post> posts = new ArrayList<Post>();

  /**
   * Returns the value of '<em><b>title</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the value of '<em><b>title</b></em>' feature
   * @generated
   */
  public String getTitle() {
    return title;
  }

  /**
   * Sets the '{@link Topic#getTitle() <em>title</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param the new value of the '{@link Topic#getTitle() title}' feature.
   * @generated
   */
  public void setTitle(String newTitle) {
    title = newTitle;
  }

  /**
   * Returns the value of '<em><b>category</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the value of '<em><b>category</b></em>' feature
   * @generated
   */
  public TopicCategory getCategory() {
    return category;
  }

  /**
   * Sets the '{@link Topic#getCategory() <em>category</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param the new value of the '{@link Topic#getCategory() category}' feature.
   * @generated
   */
  public void setCategory(TopicCategory newCategory) {
    category = newCategory;
  }

  /**
   * Returns the value of '<em><b>creator</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the value of '<em><b>creator</b></em>' feature
   * @generated
   */
  public Member getCreator() {
    return creator;
  }

  /**
   * Sets the '{@link Topic#getCreator() <em>creator</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param the new value of the '{@link Topic#getCreator() creator}' feature.
   * @generated
   */
  public void setCreator(Member newCreator) {
    creator = newCreator;
  }

  /**
   * Returns the value of '<em><b>posts</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the value of '<em><b>posts</b></em>' feature
   * @generated
   */
  public List<Post> getPosts() {
    return posts;
  }

  /**
   * Adds to the <em>posts</em> feature.
   * @generated
   */
  public void addToPosts(Post postsValue) {
    if (!posts.contains(postsValue)) {

      posts.add(postsValue);
    }

  }

  /**			
   * Removes from the <em>posts</em> feature.
   * @generated
   */
  public void removeFromPosts(Post postsValue) {
    if (posts.contains(postsValue)) {
      posts.remove(postsValue);
    }
  }

  /**			
   * Clears the <em>posts</em> feature.
   * @generated
   */
  public void clearPosts() {
    for (Post postsElement : posts) {
      removeFromPosts(postsElement);
    }
  }

  /**
   * Sets the '{@link Topic#getPosts() <em>posts</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param the new value of the '{@link Topic#getPosts() posts}' feature.
   * @generated
   */
  public void setPosts(List<Post> newPosts) {
    posts = newPosts;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   */
  @Override
  public String toString() {
    return "Topic " + " [title: " + getTitle() + "]" + " [category: " + getCategory() + "]";
  }
}
