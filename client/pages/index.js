import Head from 'next/head'
import Image from 'next/image'
import request from 'request'
import styles from '../styles/Home.module.css'
export default function Home({}) {
  return (
    <div className={styles.container}>
     than trang
    </div>
  )
}
export async function getStaticProps(context) {
    const issues = []

    return {
        props: {

        }, // will be passed to the page component as props
    }
}